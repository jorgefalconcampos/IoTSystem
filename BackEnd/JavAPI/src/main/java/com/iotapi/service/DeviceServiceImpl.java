package com.iotapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iotapi.entity.Device;
import com.iotapi.repository.DeviceRepository;

@Service
public class DeviceServiceImpl implements DeviceService{

	@Autowired
	private DeviceRepository userRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Device> findAll() {
		return userRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Device> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Device> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	@Transactional
	public Device save(Device device) {
		return userRepository.save(device);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);		
	}

}

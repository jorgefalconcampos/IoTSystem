package com.iotapi.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.iotapi.entity.Device;

public interface DeviceService {

	public Iterable<Device> findAll();
	
	
	public Page<Device> findAll(Pageable pageable);
	
	
	public Optional<Device> findById(Long id);
	
	
	public Device save(Device device);
	
	
	public void deleteById(Long id);
	
	
}

package com.iotapi.controller;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iotapi.entity.Device;
import com.iotapi.service.DeviceService;


@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/api/devices")
public class DeviceController {
	
	@Autowired
	DeviceService deviceService;
	
	
	// Create a new device
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Device device){
		try {
			deviceService.save(device);
			return ResponseEntity.status(HttpStatus.CREATED).body(deviceService.save(device));	
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	
	// Reading an existing device
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable(value="id") Long deviceId){	
		Optional<Device> oDevice = deviceService.findById(deviceId);
		if(!oDevice.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oDevice);
	}
	
	
	// Updating an existing device
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody Device deviceDetails, @PathVariable(value="id") Long deviceId){
		Optional<Device> device = deviceService.findById(deviceId);
		
		if (!device.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		device.get().setType(deviceDetails.getType());
		device.get().setLabel(deviceDetails.getLabel());
		device.get().setManufacturer(deviceDetails.getManufacturer());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(deviceService.save(device.get()));		
	}
	
	
	// Deleting a device
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable(value="id") Long deviceId){
		
		if(!deviceService.findById(deviceId).isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		deviceService.deleteById(deviceId);

		return ResponseEntity.ok().build();
	}
	
	
	// Get all devices
	@GetMapping
	public List<Device> readAll() {
		List<Device> devices = StreamSupport
				.stream(deviceService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return devices;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

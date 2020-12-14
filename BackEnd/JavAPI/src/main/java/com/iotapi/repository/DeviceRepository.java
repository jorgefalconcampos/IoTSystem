package com.iotapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iotapi.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}

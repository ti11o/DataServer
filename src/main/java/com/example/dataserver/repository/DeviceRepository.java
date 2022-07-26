package com.example.dataserver.repository;

import com.example.dataserver.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    List<Device> findBySerialNumber(String serialNumber);
    Device findTopByToken(String token);
}

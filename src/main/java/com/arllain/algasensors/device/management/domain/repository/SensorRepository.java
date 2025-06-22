package com.arllain.algasensors.device.management.domain.repository;

import com.arllain.algasensors.device.management.domain.model.SendorId;
import com.arllain.algasensors.device.management.domain.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SendorId> {
}

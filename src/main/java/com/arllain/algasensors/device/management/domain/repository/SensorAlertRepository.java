package com.arllain.algasensors.device.management.domain.repository;

import com.arllain.algasensors.device.management.domain.model.SensorAlert;
import com.arllain.algasensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorAlertRepository extends JpaRepository<SensorAlert, SensorId> {
}

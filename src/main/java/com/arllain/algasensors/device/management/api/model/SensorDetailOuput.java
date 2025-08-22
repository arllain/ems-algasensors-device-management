package com.arllain.algasensors.device.management.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorDetailOuput {
    private SensorOutput sensor;
    private SensorMonitoringOutput monitoring;
}

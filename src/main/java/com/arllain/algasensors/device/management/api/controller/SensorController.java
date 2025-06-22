package com.arllain.algasensors.device.management.api.controller;

import com.arllain.algasensors.device.management.api.model.SensorInput;
import com.arllain.algasensors.device.management.common.IdGenerator;
import com.arllain.algasensors.device.management.domain.model.Sensor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor create (@RequestBody SensorInput sensorInput) {
        return Sensor.builder()
                .id(IdGenerator.generateTSID())
                .name(sensorInput.getName())
                .ip(sensorInput.getIp())
                .location(sensorInput.getLocation())
                .protocol(sensorInput.getProtocol())
                .model(sensorInput.getModel())
                .enabled(false)
                .build();
    }
}

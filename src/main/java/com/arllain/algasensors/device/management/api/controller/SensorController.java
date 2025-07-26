package com.arllain.algasensors.device.management.api.controller;

import com.arllain.algasensors.device.management.api.model.SensorInput;
import com.arllain.algasensors.device.management.api.model.SensorOuput;
import com.arllain.algasensors.device.management.common.IdGenerator;
import com.arllain.algasensors.device.management.domain.model.SendorId;
import com.arllain.algasensors.device.management.domain.model.Sensor;
import com.arllain.algasensors.device.management.domain.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final SensorRepository sensorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SensorOuput create (@RequestBody SensorInput sensorInput) {
        Sensor sensor = Sensor.builder()
                .id(new SendorId(IdGenerator.generateTSID()))
                .name(sensorInput.getName())
                .ip(sensorInput.getIp())
                .location(sensorInput.getLocation())
                .protocol(sensorInput.getProtocol())
                .model(sensorInput.getModel())
                .enabled(false)
                .build();

        sensor = sensorRepository.saveAndFlush(sensor);

        return SensorOuput.builder()
                .id(sensor.getId().getValue())
                .name(sensor.getName())
                .ip(sensor.getIp())
                .location(sensor.getLocation())
                .protocol(sensor.getProtocol())
                .model(sensor.getModel())
                .enabled(sensor.getEnabled())
                .build();
    }
}

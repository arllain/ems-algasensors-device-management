package com.arllain.algasensors.device.management.api.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class SensorMonitorinClientBadGatewayException extends RuntimeException{
}

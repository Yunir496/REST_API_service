package com.example.rest_api_service.controller;

import com.example.rest_api_service.entity.Sensor;
import com.example.rest_api_service.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping("/registration")
    public ResponseEntity<?> registerSensor(@RequestBody Sensor sensor) {
        try{
            Sensor registeredSensor = sensorService.registerSensor(sensor);
            return ResponseEntity.ok(registeredSensor);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

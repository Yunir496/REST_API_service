package com.example.rest_api_service.service;

import com.example.rest_api_service.dao.SensorRepository;
import com.example.rest_api_service.entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    public Sensor registerSensor(Sensor sensor){
        if(sensorRepository.findByName(sensor.getName()).isPresent()){
            throw new RuntimeException("Сенсор с таким именем уже существует");
        }
        return sensorRepository.save(sensor);
    }
}

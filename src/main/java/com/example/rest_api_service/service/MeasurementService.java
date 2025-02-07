package com.example.rest_api_service.service;

import com.example.rest_api_service.dao.MeasurementRepository;
import com.example.rest_api_service.entity.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementService {
    @Autowired
    private MeasurementRepository measurementRepository;

    public Measurement addMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    public long getRainyDaysCount(){
        return measurementRepository.countByRainingTrue();
    }

}

package com.example.rest_api_service.controller;

import com.example.rest_api_service.entity.Measurement;
import com.example.rest_api_service.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {
    @Autowired
    private MeasurementService measurementService;

    @PostMapping("/add")
    public ResponseEntity<Measurement> addMeasurement(@RequestBody Measurement measurement) {
        Measurement savedMeasurement = measurementService.addMeasurement(measurement);
        return ResponseEntity.ok(savedMeasurement);
    }

    @GetMapping
    public ResponseEntity<List<Measurement>> getAllMeasurements() {
        List<Measurement> measurements = measurementService.getAllMeasurements();
        return ResponseEntity.ok(measurements);
    }

    @GetMapping("/rainyDaysCount")
    public ResponseEntity<Long> getRainyDaysCount() {
        long count = measurementService.getRainyDaysCount();
        return ResponseEntity.ok(count);
    }
}

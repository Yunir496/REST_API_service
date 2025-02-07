package com.example.rest_api_service.dao;

import com.example.rest_api_service.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    long countByRainingTrue();
}

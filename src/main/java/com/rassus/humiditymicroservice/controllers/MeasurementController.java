package com.rassus.humiditymicroservice.controllers;

import com.rassus.humiditymicroservice.services.MeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeasurementController {

    private final MeasurementService service;

    public MeasurementController(MeasurementService service) {
        this.service = service;
    }

    @GetMapping("/current-reading")
    public ResponseEntity<?> getMeasurement() {
        return ResponseEntity.of(service.generateMeasurement());
    }
}

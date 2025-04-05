package com.tinnova.avaliacao.question5.controller;

import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<VehicleDto>> getVehicles() {
        List<VehicleDto> response = vehicleService.listAllVehicles();
        return ResponseEntity.ok(response);
    }

}

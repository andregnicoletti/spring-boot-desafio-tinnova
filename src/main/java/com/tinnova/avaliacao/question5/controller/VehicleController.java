package com.tinnova.avaliacao.question5.controller;

import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.services.VehicleService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/veiculos")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<VehicleDto>> getVehicles(@RequestParam(name = "marca", required = false) String brand,
                                                        @RequestParam(name = "ano", required = false) Integer year,
                                                        @RequestParam(name = "cor", required = false) String color) {
        List<VehicleDto> response = vehicleService.findVehicles(brand, year, color);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleDto> getVehicleById(@PathVariable Integer id) {
        VehicleDto response = vehicleService.getVehicleById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<VehicleDto> createVehicle(@RequestBody VehicleDto request) {
        VehicleDto created = vehicleService.createVehicle(request);
        URI location = URI.create("/veiculos/" + created.getId());
        return ResponseEntity.created(location).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VehicleDto> updateVehicle(@PathVariable Integer id,
                                                    @RequestBody VehicleDto request) {
        VehicleDto updated = vehicleService.updateVehicle(id, request);
        return ResponseEntity.ok(updated);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VehicleDto> patchVehicle(@PathVariable Integer id,
                                                   @RequestBody Map<String, Object> updates) {
        VehicleDto updated = vehicleService.patchVehicle(id, updates);
        return ResponseEntity.ok(updated);
    }
}

package com.tinnova.avaliacao.question5.services;

import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.enums.VehicleBrand;
import com.tinnova.avaliacao.question5.enums.VehicleColor;
import com.tinnova.avaliacao.question5.model.VehicleModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
public class VehicleService {

    private final AtomicInteger id = new AtomicInteger(1);
    private final Queue<VehicleModel> vehiclesModelQueue = new ConcurrentLinkedQueue<>();

    public VehicleService() {
        // Inicializa com alguns veículos de exemplo
        vehiclesModelQueue.add(new VehicleModel(
                id.getAndIncrement(),
                "Fusca",
                VehicleBrand.VOLKSWAGEN,
                1985,
                "Carro clássico em bom estado",
                false,
                LocalDateTime.now().minusYears(1),
                LocalDateTime.now(),
                VehicleColor.BLUE
        ));

        vehiclesModelQueue.add(new VehicleModel(
                id.getAndIncrement(),
                "Onix",
                VehicleBrand.CHEVROLET,
                2020,
                "Modelo econômico com baixa quilometragem",
                true,
                LocalDateTime.now().minusMonths(6),
                LocalDateTime.now(),
                VehicleColor.GRAY
        ));
    }

    public List<VehicleDto> findVehicles(String brand, Integer year, String color) {
        return vehiclesModelQueue.stream()
                .filter(model -> brand == null || Objects.equals(model.getBrand(), brand))
                .filter(model -> year == null || Objects.equals(model.getYear(), year))
                .filter(model -> color == null || Objects.equals(model.getColor(), color))
                .map(VehicleDto::fromModel)
                .toList();
    }

    public VehicleDto getVehicleById(Integer id) {
        return vehiclesModelQueue.stream()
                .filter(vehicle -> Objects.equals(vehicle.getId(), id))
                .findFirst()
                .map(VehicleDto::fromModel)
                .orElseThrow(() -> new NoSuchElementException("Veículo com ID " + id + " não encontrado"));
    }

    public VehicleDto createVehicle(VehicleDto request) {
        VehicleModel model = VehicleModel.fromDto(request);
        Integer newId = id.getAndIncrement();
        model.setId(newId);
        vehiclesModelQueue.add(model);
        return this.getVehicleById(newId);
    }

    public VehicleDto updateVehicle(Integer id, VehicleDto request) {
        VehicleModel model = vehiclesModelQueue.stream()
                .filter(v -> Objects.equals(v.getId(), id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Veículo com ID " + id + " não encontrado"));

        model.setVehicle(request.getVeiculo());
        model.setBrand(VehicleBrand.valueOf(request.getMarca().toUpperCase()));
        model.setYear(request.getAno());
        model.setDescription(request.getDescricao());
        model.setSold(request.getVendido());
        model.setColor(VehicleColor.fromLabel(request.getCor().toUpperCase()));
        model.setUpdated(LocalDateTime.now());

        return VehicleDto.fromModel(model);
    }

    public void deleteById(Integer id) {
        vehiclesModelQueue.stream()
                .filter(vehicle -> Objects.equals(vehicle.getId(), id))
                .findFirst()
                .ifPresent(vehiclesModelQueue::remove);
    }

    public VehicleDto patchVehicle(Integer id, Map<String, Object> patch) {
        VehicleModel model = vehiclesModelQueue.stream()
                .filter(v -> Objects.equals(v.getId(), id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Veículo com ID " + id + " não encontrado"));

        patch.forEach((key, value) -> {
            switch (key) {
                case "veiculo" -> model.setVehicle((String) value);
                case "descricao" -> model.setDescription((String) value);
                case "ano" -> model.setYear((Integer) value);
                case "vendido" -> model.setSold((Boolean) value);
                case "marca" -> model.setBrand(VehicleBrand.valueOf(((String) value).toUpperCase()));
                case "cor" -> model.setColor(VehicleColor.fromLabel(((String) value).toUpperCase()));
                // campos como "id", "created", "updated" ignorados
            }
        });

        model.setUpdated(LocalDateTime.now());
        return VehicleDto.fromModel(model);
    }

}

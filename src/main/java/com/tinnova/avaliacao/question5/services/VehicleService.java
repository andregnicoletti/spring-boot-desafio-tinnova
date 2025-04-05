package com.tinnova.avaliacao.question5.services;

import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.enums.VehicleBrand;
import com.tinnova.avaliacao.question5.enums.VehicleColor;
import com.tinnova.avaliacao.question5.model.VehicleModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class VehicleService {

    private final Queue<VehicleModel> vehiclesModelQueue = new ConcurrentLinkedQueue<>();

    public VehicleService() {
        // Inicializa com alguns veículos de exemplo
        vehiclesModelQueue.add(new VehicleModel(
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

}

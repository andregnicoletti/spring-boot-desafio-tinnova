package com.tinnova.avaliacao.question5.services;

import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.model.VehicleModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class VehicleService {

    private final Queue<VehicleModel> vehiclesModelQueue = new ConcurrentLinkedQueue<>();

    public VehicleService() {
        // Inicializa com alguns veículos de exemplo
        vehiclesModelQueue.add(new VehicleModel(
                "Fusca",
                "Volkswagen",
                1985,
                "Carro clássico em bom estado",
                false,
                LocalDateTime.now().minusYears(1),
                LocalDateTime.now()
        ));

        vehiclesModelQueue.add(new VehicleModel(
                "Onix",
                "Chevrolet",
                2020,
                "Modelo econômico com baixa quilometragem",
                true,
                LocalDateTime.now().minusMonths(6),
                LocalDateTime.now()
        ));
    }

    public List<VehicleDto> listAllVehicles() {
        return vehiclesModelQueue.stream()
                .map(VehicleDto::fromModel)
                .toList();
    }

}

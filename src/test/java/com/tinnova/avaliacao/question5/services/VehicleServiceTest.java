package com.tinnova.avaliacao.question5.services;

import com.tinnova.avaliacao.question5.dto.VehicleStatsDto;
import com.tinnova.avaliacao.question5.enums.VehicleBrand;
import com.tinnova.avaliacao.question5.enums.VehicleColor;
import com.tinnova.avaliacao.question5.model.VehicleModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceTest {

    private VehicleService vehicleService;
    private ConcurrentLinkedQueue<VehicleModel> queue;

    @BeforeEach
    void setUp() {
        queue = new ConcurrentLinkedQueue<>();

        // Adiciona veículos fictícios
        VehicleModel v1 = new VehicleModel(1, "Fusca", VehicleBrand.VOLKSWAGEN, 1985, "Carro clássico", false, LocalDateTime.now().minusDays(2), null, VehicleColor.BLUE);
        VehicleModel v2 = new VehicleModel(2, "Civic", VehicleBrand.HONDA, 2021, "Moderno", false, LocalDateTime.now().minusDays(1), null, VehicleColor.BLACK);
        VehicleModel v3 = new VehicleModel(3, "Corsa", VehicleBrand.CHEVROLET, 2000, "Econômico", true, LocalDateTime.now().minusDays(10), null, VehicleColor.WHITE);

        queue.add(v1);
        queue.add(v2);
        queue.add(v3);

        vehicleService = new VehicleService(queue);
    }

    @Test
    void testCountNotSellerVehiclesStats() {
        VehicleStatsDto stats = vehicleService.countNotSellerVehicles();

        assertEquals(2, stats.getQuantidadeNaoVendido());

        assertEquals(1, stats.getQuantidadeDecadas().get("Década 1980"));
        assertEquals(1, stats.getQuantidadeDecadas().get("Década 2020"));

        assertEquals(1, stats.getQuantidadeFabricantes().get("VOLKSWAGEN"));
        assertEquals(1, stats.getQuantidadeFabricantes().get("HONDA"));
        assertEquals(1, stats.getQuantidadeFabricantes().get("CHEVROLET"));

        assertEquals(2, stats.getQuantidadeNaSemana().size());
    }
}

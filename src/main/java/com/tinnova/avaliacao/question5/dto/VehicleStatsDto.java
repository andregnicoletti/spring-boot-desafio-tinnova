package com.tinnova.avaliacao.question5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleStatsDto {

    private Long quantidadeNaoVendido;
    private Map<String, Integer> quantidadeDecadas;
    private Map<String, Integer> quantidadeFabricantes;
    private List<VehicleDto> quantidadeNaSemana;

}

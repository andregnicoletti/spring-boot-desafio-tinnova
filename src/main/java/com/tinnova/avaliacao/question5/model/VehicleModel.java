package com.tinnova.avaliacao.question5.model;


import com.tinnova.avaliacao.question5.dto.VehicleDto;
import com.tinnova.avaliacao.question5.enums.VehicleBrand;
import com.tinnova.avaliacao.question5.enums.VehicleColor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class VehicleModel {

    private Integer id;
    private String vehicle;
    private VehicleBrand brand;
    private Integer year;
    private String description;
    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;
    private VehicleColor color;

    public static VehicleModel fromDto(VehicleDto dto) {
        return new VehicleModel(
                dto.getId(),
                dto.getVeiculo(),
                VehicleBrand.valueOf(dto.getMarca().toUpperCase()),
                dto.getAno(),
                dto.getDescricao(),
                dto.getVendido(),
                dto.getCreated(),
                dto.getUpdated(),
                VehicleColor.fromLabel(dto.getCor())
        );
    }

}

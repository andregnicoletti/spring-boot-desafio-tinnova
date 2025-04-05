package com.tinnova.avaliacao.question5.model;


import com.tinnova.avaliacao.question5.enums.VehicleBrand;
import com.tinnova.avaliacao.question5.enums.VehicleColor;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class VehicleModel {

    private String vehicle;
    private VehicleBrand brand;
    private Integer year;
    private String description;
    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;
    private VehicleColor color;

}

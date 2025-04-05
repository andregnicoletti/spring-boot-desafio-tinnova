package com.tinnova.avaliacao.question5.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class VehicleModel {

    private String vehicle;
    private String brand;
    private Integer year;
    private String description;
    private Boolean sold;
    private LocalDateTime created;
    private LocalDateTime updated;

}

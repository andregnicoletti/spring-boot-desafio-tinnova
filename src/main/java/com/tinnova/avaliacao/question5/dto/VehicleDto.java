package com.tinnova.avaliacao.question5.dto;

import com.tinnova.avaliacao.question5.model.VehicleModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {

    private String veiculo;
    private String marca;
    private Integer ano;
    private String descricao;
    private Boolean vendido;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String cor;

    public static VehicleDto fromModel(VehicleModel model) {
        return new VehicleDto(
                model.getVehicle(),
                model.getBrand().toString(),
                model.getYear(),
                model.getDescription(),
                model.getSold(),
                model.getCreated(),
                model.getUpdated(),
                model.getColor().getLabel()
        );
    }
}

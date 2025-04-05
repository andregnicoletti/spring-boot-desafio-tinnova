package com.tinnova.avaliacao.question5.enums;

public enum VehicleColor {

    RED("vermelho"),
    BLACK("preto"),
    WHITE("branco"),
    BLUE("azul"),
    SILVER("prata"),
    GRAY("cinza");

    private final String value;

    VehicleColor(String value) {
        this.value = value;
    }

    public String getLabel() {
        return value;
    }

    public static VehicleColor fromLabel(String label) {
        for (VehicleColor color : values()) {
            if (color.value.equalsIgnoreCase(label)) {
                return color;
            }
        }
        throw new IllegalArgumentException("Cor inválida: " + label);
    }
}

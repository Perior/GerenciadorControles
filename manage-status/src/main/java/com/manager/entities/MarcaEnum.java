package com.manager.entities;

public enum MarcaEnum {

    TOSHIBA("Toshiba Corporation"),
    SAMSUNG("Samsung Electronics"),
    LG("LG Electronics"),
    PANASONIC("Panasonic"),
    WHIRLPOOL("Whirlpool Corporation"),
    HAIER("Haier"),
    MIDEA("Midea Group"),
    VOLTAS("Voltas"),
    CARRIER("Carrier Air Conditioners"),
    SONY("Sony Electronics"),
    SCEPTRE("Sceptre Incorporated"),
    HISENSE("Hisense Group"),
    TCL("TCL Technology");

    private String description;

    private MarcaEnum(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}

package com.spring5projects.sfgpetclinic.model;

import java.time.LocalDate;

public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

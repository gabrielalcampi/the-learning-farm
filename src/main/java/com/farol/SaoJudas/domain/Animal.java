package com.farol.SaoJudas.domain;

import javax.persistence.Entity;

@Entity
public class Animal {
    private String id;

    private short weight;

    private boolean vaccine;

    private Feed sustenance;

    public Animal(short weight, boolean vaccine, Feed sustenance) {
        this.weight = weight;
        this.vaccine = vaccine;
        this.sustenance = sustenance;
    }
}

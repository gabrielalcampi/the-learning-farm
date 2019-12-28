package com.farol.SaoJudas.domain;

import javax.persistence.Entity;

@Entity
public class Feed {

    private String id;

    private String name;

    public Feed(String name) {
        this.name = name;
    }
}

package com.farol.SaoJudas.domain;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Handle {
    private String id;

    private Date date;

    private List<Animal> livestock;
}

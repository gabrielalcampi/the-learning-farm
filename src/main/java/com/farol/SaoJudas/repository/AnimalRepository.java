package com.farol.SaoJudas.repository;

import com.farol.SaoJudas.domain.Animal;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public abstract class AnimalRepository implements Repository {
    public abstract Optional<Animal> FindAnimalById(String id);
}

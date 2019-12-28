package com.farol.SaoJudas.repository;

import com.farol.SaoJudas.domain.Handle;
import org.springframework.stereotype.Repository;

public abstract class HandleRepository implements Repository {
    public abstract void save(Handle handle);
}


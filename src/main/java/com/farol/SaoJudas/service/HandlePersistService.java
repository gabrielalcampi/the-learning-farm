package com.farol.SaoJudas.service;

import com.farol.SaoJudas.domain.Handle;
import com.farol.SaoJudas.repository.HandleRepository;
import org.springframework.stereotype.Service;

@Service
public class HandlePersistService {
    private HandleRepository handleRepository;

    public void persist(Handle handle){
        handleRepository.save(handle);
    }
}

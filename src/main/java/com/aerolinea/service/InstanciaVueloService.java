package com.aerolinea.service;

import com.aerolinea.model.InstanciaVuelo;
import com.aerolinea.repository.InstanciaVueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstanciaVueloService {

    private final InstanciaVueloRepository instanciaVueloRepository;

    public InstanciaVueloService(InstanciaVueloRepository instanciaVueloRepository) {
        this.instanciaVueloRepository = instanciaVueloRepository;
    }

    public List<InstanciaVuelo> findAll() {
        return instanciaVueloRepository.findAll();
    }

    public InstanciaVuelo save(InstanciaVuelo instanciaVuelo) {
        return instanciaVueloRepository.save(instanciaVuelo);
    }
}

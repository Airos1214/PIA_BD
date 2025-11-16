package com.aerolinea.service;

import com.aerolinea.model.Vuelo;
import com.aerolinea.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {

    private final VueloRepository vueloRepository;

    public VueloService(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public List<Vuelo> findAll() {
        return vueloRepository.findAll();
    }

    public Vuelo save(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }
}

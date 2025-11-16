package com.aerolinea.service;

import com.aerolinea.model.Boleto;
import com.aerolinea.repository.BoletoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletoService {

    private final BoletoRepository boletoRepository;

    public BoletoService(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    public List<Boleto> findAll() {
        return boletoRepository.findAll();
    }

    public Boleto save(Boleto boleto) {
        return boletoRepository.save(boleto);
    }
}

package com.aerolinea.controller;

import com.aerolinea.model.*;
import com.aerolinea.repository.*;
import com.aerolinea.service.BoletoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boletos")
public class BoletoController {

    private final BoletoService boletoService;
    private final PasajeroRepository pasajeroRepository;
    private final ReservaRepository reservaRepository;
    private final InstanciaVueloRepository instanciaVueloRepository;

    public BoletoController(BoletoService boletoService,
                            PasajeroRepository pasajeroRepository,
                            ReservaRepository reservaRepository,
                            InstanciaVueloRepository instanciaVueloRepository) {
        this.boletoService = boletoService;
        this.pasajeroRepository = pasajeroRepository;
        this.reservaRepository = reservaRepository;
        this.instanciaVueloRepository = instanciaVueloRepository;
    }

    @GetMapping
    public List<Boleto> listar() {
        return boletoService.findAll();
    }

    @PostMapping
    public Boleto agregar(@RequestBody Boleto boleto) {

        if (boleto.getPasajero() != null && boleto.getPasajero().getIdPasajero() != null) {
            boleto.setPasajero(
                pasajeroRepository.findById(boleto.getPasajero().getIdPasajero()).orElse(null)
            );
        }

        if (boleto.getReserva() != null && boleto.getReserva().getIdReserva() != null) {
            boleto.setReserva(
                reservaRepository.findById(boleto.getReserva().getIdReserva()).orElse(null)
            );
        }

        if (boleto.getInstanciaVuelo() != null && boleto.getInstanciaVuelo().getIdInstanciaVuelo() != null) {
            boleto.setInstanciaVuelo(
                instanciaVueloRepository.findById(boleto.getInstanciaVuelo().getIdInstanciaVuelo()).orElse(null)
            );
        }

        return boletoService.save(boleto);
    }
}

package com.aerolinea.service;

import com.aerolinea.model.Reserva;
import com.aerolinea.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}

package com.aerolinea.controller;

import com.aerolinea.model.Reserva;
import com.aerolinea.service.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public List<Reserva> getReservas() {
        return reservaService.getAllReservas();
    }

    @PostMapping
    public Reserva saveReserva(@RequestBody Reserva reserva) {
        return reservaService.saveReserva(reserva);
    }
}

package com.aerolinea.controller;

import com.aerolinea.model.VentaEncabezado;
import com.aerolinea.service.VentaEncabezadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaEncabezadoController {

    private final VentaEncabezadoService ventaService;

    public VentaEncabezadoController(VentaEncabezadoService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public List<VentaEncabezado> getVentas() {
        return ventaService.getAllVentas();
    }

    @PostMapping
    public VentaEncabezado saveVenta(@RequestBody VentaEncabezado venta) {
        return ventaService.saveVenta(venta);
    }
}

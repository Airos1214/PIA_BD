package com.aerolinea.controller;

import com.aerolinea.model.Cliente;
import com.aerolinea.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Agregar un nuevo cliente
    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}


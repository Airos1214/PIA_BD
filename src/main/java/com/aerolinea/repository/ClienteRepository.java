package com.aerolinea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aerolinea.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}


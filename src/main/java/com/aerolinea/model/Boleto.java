package com.aerolinea.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Boleto")
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleto")
    private Integer idBoleto;

    @Column(name = "numero_boleto", length = 30)
    private String numeroBoleto;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "clase", length = 20)
    private String clase;

    @Column(name = "asiento", length = 10)
    private String asiento;

    @Column(name = "estado", length = 20)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private Pasajero pasajero;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "id_instancia_vuelo")
    private InstanciaVuelo instanciaVuelo;

    // Getters y Setters
    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public InstanciaVuelo getInstanciaVuelo() {
        return instanciaVuelo;
    }

    public void setInstanciaVuelo(InstanciaVuelo instanciaVuelo) {
        this.instanciaVuelo = instanciaVuelo;
    }
}

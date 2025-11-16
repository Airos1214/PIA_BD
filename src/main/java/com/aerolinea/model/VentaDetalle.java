package com.aerolinea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Venta_Detalle")
public class VentaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer idDetalle;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "impuestos")
    private Double impuestos;

    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private VentaEncabezado venta;

    @ManyToOne
    @JoinColumn(name = "id_boleto")
    private Boleto boleto;

    public VentaDetalle() {}

    // Getters y Setters
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public VentaEncabezado getVenta() {
        return venta;
    }

    public void setVenta(VentaEncabezado venta) {
        this.venta = venta;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
}

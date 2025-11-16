package com.aerolinea.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "Venta_Impuesto")
public class VentaImpuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta_impuesto")
    private Integer idVentaImpuesto;

    @Column(name = "id_detalle", nullable = false)
    private Integer idDetalle;

    @Column(name = "id_impuesto", nullable = false)
    private Integer idImpuesto;

    @Column(name = "monto_impuesto", nullable = false)
    private BigDecimal montoImpuesto;

    public VentaImpuesto() {}

    public Integer getIdVentaImpuesto() {
        return idVentaImpuesto;
    }

    public void setIdVentaImpuesto(Integer idVentaImpuesto) {
        this.idVentaImpuesto = idVentaImpuesto;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public BigDecimal getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(BigDecimal montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }
}

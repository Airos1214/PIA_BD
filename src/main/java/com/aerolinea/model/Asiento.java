package com.aerolinea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Asiento")
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asiento")
    private Integer idAsiento;

    @Column(name = "id_avion", nullable = false)
    private Integer idAvion;

    @Column(name = "codigo_asiento", length = 10, nullable = false)
    private String codigoAsiento;

    @Column(name = "fila")
    private Short fila;

    @Column(name = "columna", length = 5)
    private String columna;

    @Column(name = "clase", length = 30)
    private String clase;

    @Column(name = "ubicacion", length = 100)
    private String ubicacion;

    public Asiento() {}

    public Integer getIdAsiento() { return idAsiento; }
    public void setIdAsiento(Integer idAsiento) { this.idAsiento = idAsiento; }

    public Integer getIdAvion() { return idAvion; }
    public void setIdAvion(Integer idAvion) { this.idAvion = idAvion; }

    public String getCodigoAsiento() { return codigoAsiento; }
    public void setCodigoAsiento(String codigoAsiento) { this.codigoAsiento = codigoAsiento; }

    public Short getFila() { return fila; }
    public void setFila(Short fila) { this.fila = fila; }

    public String getColumna() { return columna; }
    public void setColumna(String columna) { this.columna = columna; }

    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
}

package com.aerolinea.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pasajero")
public class Pasajero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasajero")
    private Integer idPasajero;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido_p", length = 50)
    private String apellidoP;

    @Column(name = "apellido_m", length = 50)
    private String apellidoM;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @Column(name = "pasaporte")
    private byte[] pasaporte;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Pasajero() {}

    // Getters y setters
    public Integer getIdPasajero() { return idPasajero; }
    public void setIdPasajero(Integer idPasajero) { this.idPasajero = idPasajero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoP() { return apellidoP; }
    public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }

    public String getApellidoM() { return apellidoM; }
    public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public byte[] getPasaporte() { return pasaporte; }
    public void setPasaporte(byte[] pasaporte) { this.pasaporte = pasaporte; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}

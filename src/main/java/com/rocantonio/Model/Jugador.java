package com.rocantonio.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rocag on 06/10/2015.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private Date fechaNacimiento;

    private int canastasTotales;

    private int asistenciasTotales;

    private int rebotesTotales;

    private String posicionCampo;

    @ManyToOne
    private Equipo equipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCanastasTotales() {
        return canastasTotales;
    }

    public void setCanastasTotales(int canastasTotales) {
        this.canastasTotales = canastasTotales;
    }

    public int getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public void setAsistenciasTotales(int asistenciasTotales) {
        this.asistenciasTotales = asistenciasTotales;
    }

    public int getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(int rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    public String getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", canastasTotales=" + canastasTotales +
                ", asistenciasTotales=" + asistenciasTotales +
                ", rebotesTotales=" + rebotesTotales +
                ", posicionCampo='" + posicionCampo + '\'' +
                ", equipo=" + equipo +
                '}';
    }

    public Jugador(){};

    public Jugador(String nombre, Date fechaNacimiento, int canastasTotales, int asistenciasTotales, int rebotesTotales, String posicionCampo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.canastasTotales = canastasTotales;
        this.asistenciasTotales = asistenciasTotales;
        this.rebotesTotales = rebotesTotales;
        this.posicionCampo = posicionCampo;
    }



}

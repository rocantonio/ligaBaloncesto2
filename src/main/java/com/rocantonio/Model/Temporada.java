package com.rocantonio.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rocag on 20/10/2015.
 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int anyo;

    @ManyToOne
    private Liga ligas;

    @ManyToMany(mappedBy = "temporadas")
    private Set<Equipo> equipos = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Liga getLigas() {
        return ligas;
    }

    public void setLigas(Liga ligas) {
        this.ligas = ligas;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }


    public Temporada(){}

    public Temporada(int anyo) {
        this.anyo = anyo;
        this.ligas = ligas;
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", anyo=" + anyo +
                ", ligas=" + ligas +
                ", equipos=" + equipos +
                '}';
    }
}

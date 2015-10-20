//package com.rocantonio.Model;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * Created by rocag on 08/10/2015.
// */
//@Entity
//public class Liga {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @ManyToMany
//    private Set<Equipo> equipos = new HashSet<>();
//
//    private String nombre;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Set<Equipo> getEquipos() {
//        return equipos;
//    }
//
//    public void setEquipos(Set<Equipo> equipos) {
//        this.equipos = equipos;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }


//}

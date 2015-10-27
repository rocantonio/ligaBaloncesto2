package com.rocantonio.Service;

import com.rocantonio.Model.Equipo;
import com.rocantonio.Model.Jugador;
import com.rocantonio.Repository.EquipoRepository;
import com.rocantonio.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rocag on 08/10/2015.
 */
@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testEquipos(){


//        Jugador jugador = jugadorRepository.findByNombreContaining("Roc").get(0);
//        jugador.setEquipo(equipo1);
//        jugadorRepository.save(jugador);
//        Set<Jugador> jugadores1 = new HashSet<>(jugadorRepository.findByNombreContaining("Roc"));

//        Equipo equipo1 = new Equipo(
//                "FCB",
//                "Barcelona",
//                new Date(2007, 12, 3),
//                jugadores1
//        );


    }
}

package com.rocantonio.Service;

import com.rocantonio.Model.Jugador;
import com.rocantonio.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by rocag on 06/10/2015.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugadores() {
        Jugador jugador = new Jugador(
                "Roc",
                new Date(1996, 3, 13),
                2, 5, 7,
                "Pibot"
        );
        Jugador jugador1 = new Jugador(
                "Nat",
                new Date(1996, 9, 23),
                12, 25, 71,
                "Pibot"
        );
        Jugador jugador2 = new Jugador(
                "Laia",
                new Date(1986, 7, 15),
                25, 23, 27,
                "Pasr"
        );
        Jugador jugador3 = new Jugador(
                "David",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        jugadorRepository.save(jugador);
        jugadorRepository.save(jugador1);
        jugadorRepository.save(jugador2);
        jugadorRepository.save(jugador3);
        System.out.println(jugadorRepository.findByNombreContaining("Roc"));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(20));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(2, 7));
        System.out.println(jugadorRepository.findByPosicionCampoEquals("Central"));
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(new Date(1990, 2, 2)));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(20, new Date(1990, 2, 2)));
    }



}

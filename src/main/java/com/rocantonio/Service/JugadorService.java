package com.rocantonio.Service;

import com.rocantonio.Model.Equipo;
import com.rocantonio.Model.Jugador;
import com.rocantonio.Model.Liga;
import com.rocantonio.Model.Temporada;
import com.rocantonio.Repository.EquipoRepository;
import com.rocantonio.Repository.JugadorRepository;
import com.rocantonio.Repository.LigaRepository;
import com.rocantonio.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * Created by rocag on 06/10/2015.
 */


@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private EquipoRepository equipoRepository;


    public void testJugadores() {
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
                "Pipi",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador4 = new Jugador(
                "charls",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador12 = new Jugador(
                "friki",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador5 = new Jugador(
                "snapa",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador6 = new Jugador(
                "David",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador7 = new Jugador(
                "Chechu",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador8 = new Jugador(
                "Catana",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador9 = new Jugador(
                "Laca",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador10 = new Jugador(
                "Supicha",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador11 = new Jugador(
                "Shurma",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador13 = new Jugador(
                "Sirio",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador14 = new Jugador(
                "Patale",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador15 = new Jugador(
                "Andelelpues",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador16 = new Jugador(
                "Yatekomo",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador17 = new Jugador(
                "Chaarlsepan",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador18 = new Jugador(
                "Pollo",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador19 = new Jugador(
                "Faku",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador20 = new Jugador(
                "Lateyo",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador21 = new Jugador(
                "Chiquitod",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador22 = new Jugador(
                "Palada",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador23 = new Jugador(
                "Sadrepan",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador24 = new Jugador(
                "Carachancla",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Central"
        );
        Jugador jugador25 = new Jugador(
                "Sterno",
                new Date(1999, 9, 21),
                23, 85, 17,
                "Gacho"
        );

        Equipo equipo1 = new Equipo();
        equipo1.setLocalidad("Barcelona");
        equipo1.setFechaCreacion( new Date(2007, 12, 3));
        equipo1.setNombre("FCB");

        Equipo equipo2 = new Equipo();
        equipo2.setLocalidad("Madrid");
        equipo2.setFechaCreacion( new Date(2000, 1, 6));
        equipo2.setNombre("Lac");

        Equipo equipo3 = new Equipo();
        equipo3.setLocalidad("Lakers");
        equipo3.setFechaCreacion( new Date(1989, 20, 10));
        equipo3.setNombre("FCweB");

        Equipo equipo4 = new Equipo();
        equipo4.setLocalidad("Boston");
        equipo4.setFechaCreacion( new Date(1978, 21, 8));
        equipo4.setNombre("FCBfa");

        Equipo equipo5 = new Equipo();
        equipo5.setLocalidad("NewYork");
        equipo5.setFechaCreacion( new Date(1997, 22, 12));
        equipo5.setNombre("sed");

        Temporada temporada1 = new Temporada();
        temporada1.setAnyo(2001);

        Temporada temporada2 = new Temporada();
        temporada2.setAnyo(2002);

        Liga liga1 = new Liga();
        liga1.setNombre("BBVA");

//        temps1.add(temporada2);

        equipo1.getTemporadas().add(temporada1);
        equipo2.getTemporadas().add(temporada1);
        equipo3.getTemporadas().add(temporada1);
        equipo3.getTemporadas().add(temporada2);
        equipo4.getTemporadas().add(temporada2);
        equipo5.getTemporadas().add(temporada2);

        temporada1.setLigas(liga1);
        temporada2.setLigas(liga1);

        jugador1.setEquipo(equipo1);
        jugador2.setEquipo(equipo1);
        jugador3.setEquipo(equipo1);
        jugador4.setEquipo(equipo1);
        jugador5.setEquipo(equipo1);

        jugador6.setEquipo(equipo2);
        jugador7.setEquipo(equipo2);
        jugador8.setEquipo(equipo2);
        jugador9.setEquipo(equipo2);
        jugador10.setEquipo(equipo2);

        jugador11.setEquipo(equipo3);
        jugador12.setEquipo(equipo3);
        jugador13.setEquipo(equipo3);
        jugador14.setEquipo(equipo3);
        jugador15.setEquipo(equipo3);

        jugador16.setEquipo(equipo4);
        jugador17.setEquipo(equipo4);
        jugador18.setEquipo(equipo4);
        jugador19.setEquipo(equipo4);
        jugador20.setEquipo(equipo4);

        jugador21.setEquipo(equipo5);
        jugador22.setEquipo(equipo5);
        jugador23.setEquipo(equipo5);
        jugador24.setEquipo(equipo5);
        jugador25.setEquipo(equipo5);

        equipoRepository.save(equipo1);
        equipoRepository.save(equipo2);
        equipoRepository.save(equipo3);
        equipoRepository.save(equipo4);
        equipoRepository.save(equipo5);

        jugadorRepository.save(jugador1);
        jugadorRepository.save(jugador2);
        jugadorRepository.save(jugador3);
        jugadorRepository.save(jugador4);
        jugadorRepository.save(jugador5);
        jugadorRepository.save(jugador6);
        jugadorRepository.save(jugador7);
        jugadorRepository.save(jugador8);
        jugadorRepository.save(jugador9);
        jugadorRepository.save(jugador10);
        jugadorRepository.save(jugador11);
        jugadorRepository.save(jugador12);
        jugadorRepository.save(jugador13);
        jugadorRepository.save(jugador14);
        jugadorRepository.save(jugador15);
        jugadorRepository.save(jugador16);
        jugadorRepository.save(jugador17);
        jugadorRepository.save(jugador18);
        jugadorRepository.save(jugador19);
        jugadorRepository.save(jugador20);
        jugadorRepository.save(jugador21);
        jugadorRepository.save(jugador22);
        jugadorRepository.save(jugador23);
        jugadorRepository.save(jugador24);
        jugadorRepository.save(jugador25);

        temporadaRepository.save(temporada1);
        temporadaRepository.save(temporada2);

        ligaRepository.save(liga1);

        System.out.println(jugadorRepository.findByNombreContaining("Roc"));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(20));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(2, 7));
        System.out.println(jugadorRepository.findByPosicionCampoEquals("Central"));
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(new Date(1990, 2, 2)));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(20, new Date(1990, 2, 2)));
        System.out.println(equipoRepository.findByLocalidadContaining("sed"));
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicionCampo("sed", "Gacho"));
        System.out.println(jugadorRepository.findFirstByOrderByCanastasTotalesDesc());
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        System.out.println(jugadorRepository.findByEquipoNombreCanastasTotalesDesc("sed"));
    }



}

package com.rocantonio.Repository;

import com.rocantonio.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by rocag on 06/10/2015.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{

    List<Jugador> findByNombreContaining(String name);
    List<Jugador> findByCanastasTotalesGreaterThanEqual(int canastas);
    List<Jugador> findByAsistenciasTotalesBetween(int num1, int num2);
    List<Jugador> findByPosicionCampoEquals(String pos);
    List<Jugador> findByFechaNacimientoLessThan(Date fech);
    List<Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(int canastas, Date fech);
}

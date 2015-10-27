package com.rocantonio.Repository;

import com.rocantonio.Model.Equipo;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by rocag on 08/10/2015.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {
    List<Equipo> findByNombreContaining(String name);
    List<Equipo> findByLocalidadContaining(String localidad);
}

package com.softni.syncproyecto.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.softni.syncproyecto.model.proyecto;

public interface proyectoRepository extends MongoRepository<proyecto, String> {
    List<proyecto> findByIdProyecto(String idProyecto);

    void deleteByIdProyecto(String idProyecto);
}

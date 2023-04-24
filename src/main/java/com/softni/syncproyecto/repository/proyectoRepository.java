package com.softni.syncproyecto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.softni.syncproyecto.model.proyecto;

public interface proyectoRepository extends MongoRepository<proyecto, String> {

}

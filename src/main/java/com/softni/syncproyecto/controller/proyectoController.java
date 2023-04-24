package com.softni.syncproyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softni.syncproyecto.model.proyecto;
import com.softni.syncproyecto.repository.proyectoRepository;

@RestController
public class proyectoController {
    @Autowired
    private proyectoRepository projectRepository;

    @GetMapping("/proyectos")
    public List<proyecto> obtenerTodasLasEntidades() {
        System.out.println("Se obtienen todos los proyectos");
        return projectRepository.findAll();
    }

    @PostMapping("/proyectos")
    public proyecto guardarEntidad(@RequestBody proyecto entidad) {
        System.out.println("Se guarda un proyecto: " + entidad.toString());
        return projectRepository.save(entidad);
    }

    @PutMapping("/proyectos/{id}")
    public proyecto actualizarEntidad(@PathVariable Integer id, @RequestBody proyecto entidad) {
        entidad.setId(id.toString());
        System.out.println("Se actualiza un proyecto: " + entidad.toString());
        return projectRepository.save(entidad);
    }

    @DeleteMapping("/proyectos/{id}")
    public void eliminarEntidad(@PathVariable String id) {
        System.out.println("Se elimina un proyecto: " + id);
        // La entidad se elimina por el id, no por el objeto, la entidad borrada se
        // devuelve en la respuesta
        System.out.println("Se elimina un proyecto: " + projectRepository.findById(id).toString());
        projectRepository.deleteById(id.toString());

    }

}

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

    // Se obtiene un proyecto por su idProyecto
    @GetMapping("/proyectos/{idProyecto}")
    public List<proyecto> obtenerEntidadPorIdProyecto(@PathVariable String idProyecto) {
        System.out.println("Se obtiene un proyecto por su idProyecto: " + idProyecto);
        System.out
                .println("Se obtiene un proyecto por su idProyecto: " + projectRepository.findByIdProyecto(idProyecto));
        return projectRepository.findByIdProyecto(idProyecto);
    }

    @PostMapping("/proyectos")
    public proyecto guardarEntidad(@RequestBody proyecto entidad) {
        System.out.println("Se guarda un proyecto: " + entidad.toString());
        return projectRepository.save(entidad);
    }

    // Peticion PUT para actualizar un proyecto
    @PutMapping("/proyectos/{idProyecto}")
    public proyecto actualizarEntidad(@RequestBody proyecto entidad, @PathVariable String idProyecto) {
        System.out.println("Se actualiza un proyecto: " + entidad.toString());
        return projectRepository.save(entidad);
    }

    // Peticion DELETE para eliminar un proyecto
    @DeleteMapping("/proyectos/{idProyecto}")
    public void eliminarEntidad(@PathVariable String idProyecto) {
        System.out.println("Se elimina un proyecto: " + idProyecto);
        projectRepository.deleteById(idProyecto);
    }

}

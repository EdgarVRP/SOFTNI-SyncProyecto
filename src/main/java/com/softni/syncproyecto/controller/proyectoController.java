package com.softni.syncproyecto.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;

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
        List<proyecto> proyectoExistente = projectRepository.findByIdProyecto(idProyecto);
        if (proyectoExistente.size() > 0) {
            proyecto proyectoActualizado = proyectoExistente.get(0);
            if (entidad.getProjectName() != null) {
                proyectoActualizado.setProjectName(entidad.getProjectName());
            }
            if (entidad.getNumContrato() != null) {
                proyectoActualizado.setNumContrato(entidad.getNumContrato());
            }
            if (entidad.getFechaContratoProyecto() != null) {
                proyectoActualizado.setFechaContratoProyecto(entidad.getFechaContratoProyecto());
            }
            if (entidad.getTotalCredito() != null) {
                proyectoActualizado.setTotalCredito(entidad.getTotalCredito());
            }
            if (entidad.getCreditoPagado() != null) {
                proyectoActualizado.setCreditoPagado(entidad.getCreditoPagado());
            }
            if (entidad.getCreditoPendientePago() != null) {
                proyectoActualizado.setCreditoPendientePago(entidad.getCreditoPendientePago());
            }
            if (entidad.getRutaContrato() != null) {
                proyectoActualizado.setRutaContrato(entidad.getRutaContrato());
            }
            if (entidad.getPlazoCredito() != null) {
                proyectoActualizado.setPlazoCredito(entidad.getPlazoCredito());
            }
            if (entidad.getFlujos() != null) {
                proyectoActualizado.setFlujos(entidad.getFlujos());
            }
            if (entidad.getFinanzas() != null) {
                proyectoActualizado.setFinanzas(entidad.getFinanzas());
            }
            if (entidad.getFideicomisos() != null) {
                proyectoActualizado.setFideicomisos(entidad.getFideicomisos());
            }
            if (entidad.getRevisionDocumental() != null) {
                proyectoActualizado.setRevisionDocumental(entidad.getRevisionDocumental());
            }
            if (entidad.getRevisionLegal() != null) {
                proyectoActualizado.setRevisionLegal(entidad.getRevisionLegal());
            }
            if (entidad.getRevisionTecnica() != null) {
                proyectoActualizado.setRevisionTecnica(entidad.getRevisionTecnica());
            }
            if (entidad.getNumProveedores() != null) {
                proyectoActualizado.setNumProveedores(entidad.getNumProveedores());
            }
            if (entidad.getDiaPago() != null) {
                proyectoActualizado.setDiaPago(entidad.getDiaPago());
            }
            projectRepository.save(proyectoActualizado);
            return proyectoActualizado;
        } else {
            // Manejar el caso en que el proyecto no existe
            System.out.println("El proyecto no existe");
            return null;
        }
    }

    // Peticion DELETE para eliminar un proyecto
    @DeleteMapping("/proyectos/{idProyecto}")
    public void eliminarEntidad(@PathVariable String idProyecto) {
        System.out.println("Se elimina un proyecto: " + idProyecto);
        // projectRepository.findByIdProyecto(idProyecto);
        // se elimina el proyecto
        projectRepository.deleteByIdProyecto(idProyecto);
    }
}

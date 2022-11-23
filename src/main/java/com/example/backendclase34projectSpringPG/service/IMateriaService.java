package com.example.backendclase34projectSpringPG.service;

import com.example.backendclase34projectSpringPG.modelo.EstudianteDTO;
import com.example.backendclase34projectSpringPG.modelo.Materia;
import com.example.backendclase34projectSpringPG.modelo.MateriaDTO;

import java.util.Set;

public interface IMateriaService {

    void crearMateria(MateriaDTO materiaDTO);
    MateriaDTO leerMateria(Long id);
    void modificarMateria (MateriaDTO materiaDTO);
    void eliminarMateria(Long id);
    Set<MateriaDTO> getTodos();

}

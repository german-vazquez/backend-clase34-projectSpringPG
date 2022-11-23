package com.example.backendclase34projectSpringPG.service;

import com.example.backendclase34projectSpringPG.modelo.Estudiante;
import com.example.backendclase34projectSpringPG.modelo.EstudianteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    private IEstudianteService estudianteService;
    @Test
    public void testCrearEstudiante(){
        EstudianteDTO estudianteDTO= new EstudianteDTO();
        estudianteDTO.setNombre("cosme");
        estudianteDTO.setApellido("fulanito");
        estudianteService.crearEstudiante(estudianteDTO);
        EstudianteDTO estudianteCosme = estudianteService.leerEstudiante(1L);

        assertTrue(estudianteCosme !=null);

    }

}
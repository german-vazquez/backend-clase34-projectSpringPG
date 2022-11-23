package com.example.backendclase34projectSpringPG.service;

import com.example.backendclase34projectSpringPG.modelo.Estudiante;
import com.example.backendclase34projectSpringPG.modelo.EstudianteDTO;
import com.example.backendclase34projectSpringPG.repository.IEstudianteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class EstudianteService implements IEstudianteService{

    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearEstudiante(EstudianteDTO estudianteDTO) {
        //necesitamos crear un estudiante pero recibimos como parámetro un estudianteDTO
        // para esto sirve el objeto Mapper que creamos, para leer los datos del DTO y al ver que coinciden con los atributos del objeto estudiante, los mapea en objetos de otra clase.
        Estudiante estudiante = mapper.convertValue(estudianteDTO,Estudiante.class);
        estudianteRepository.save(estudiante);
    }

    @Override
    public EstudianteDTO leerEstudiante(Long id) {
        Optional<Estudiante> estudiante=estudianteRepository.findById(id);
        EstudianteDTO estudianteDTO= null;
        if(estudiante.isPresent())
            estudianteDTO= mapper.convertValue(estudiante, EstudianteDTO.class);
        return estudianteDTO;
    }
    // crearEstudiante y guardarEstudiante es redundante!
    public void guardarEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante= mapper.convertValue(estudianteDTO,Estudiante.class);
        estudianteRepository.save(estudiante);
    }

    @Override
    public void modificarEstudiante(EstudianteDTO estudianteDTO) {
        guardarEstudiante(estudianteDTO);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);

    }

    @Override
    public Set<EstudianteDTO> getTodos() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        Set<EstudianteDTO> estudiantesDTO = new HashSet<>();

        for (Estudiante estudiante: estudiantes) {
            estudiantesDTO.add(mapper.convertValue(estudiante, EstudianteDTO.class));
        }
        return estudiantesDTO;
    }
}

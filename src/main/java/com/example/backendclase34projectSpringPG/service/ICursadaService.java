package com.example.backendclase34projectSpringPG.service;

import com.example.backendclase34projectSpringPG.modelo.CursadaDTO;

import java.util.Set;

public interface ICursadaService {
    void crearCursada(CursadaDTO cursadaDTO);
    CursadaDTO leerCursada (Long id);
    void modificarCursada(CursadaDTO cursadaDTO);
    void eliminarCursada(Long id);
    Set<CursadaDTO> getTodos();
}

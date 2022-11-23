package com.example.backendclase34projectSpringPG.repository;

import com.example.backendclase34projectSpringPG.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {

}

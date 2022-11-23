package com.example.backendclase34projectSpringPG.repository;

import com.example.backendclase34projectSpringPG.modelo.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository<Materia,Long> {
}

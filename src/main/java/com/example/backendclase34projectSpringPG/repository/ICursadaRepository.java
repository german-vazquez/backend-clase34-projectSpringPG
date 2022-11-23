package com.example.backendclase34projectSpringPG.repository;

import com.example.backendclase34projectSpringPG.modelo.Cursada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursadaRepository extends JpaRepository<Cursada, Long> {
}

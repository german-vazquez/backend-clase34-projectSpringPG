package com.example.backendclase34projectSpringPG.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="materias")
public class Materia {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "materia")
    @JsonIgnore
    private Set<Cursada> cursadas;

    public Materia() {
    }

    public Set<Cursada> getCursadas() {
        return cursadas;
    }

    public void setCursadas(Set<Cursada> cursadas) {
        this.cursadas = cursadas;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

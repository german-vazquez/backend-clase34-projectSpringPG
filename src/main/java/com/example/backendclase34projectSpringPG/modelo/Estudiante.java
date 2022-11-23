package com.example.backendclase34projectSpringPG.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;
    @OneToMany(mappedBy = "estudiante")
    @JsonIgnore
    private Set<Cursada> cursadas=new HashSet<>();

    public Estudiante() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

package com.example.backendclase34projectSpringPG.modelo;

import javax.persistence.*;

@Entity
@Table(name="cursadas")
public class Cursada {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="estudiante_id", nullable = false)
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name="materia_id", nullable = false)
    private Materia materia;
    private Double nota;

    public Cursada() {
    }

    public Long getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private long idCurso;
    private String nome;
    private boolean active;
    private List<Turmas> turmas = new ArrayList<Turmas>();

    public Curso(long idCurso, String nome, boolean active) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.active = active;
    }


    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turmas> turmas) {
        this.turmas = turmas;
    }

    // métodos
    public void ativaCurso() {
        this.active = true;
    }

    public void desativaCurso() {
        this.active = false;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nome='" + nome + '\'' +
                ", active=" + active +
                ", turmas=" + turmas +
                '}';
    }
}

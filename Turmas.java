package com.company;

import java.util.ArrayList;
import java.util.List;

public class Turmas {
    private long idTurma;
    private String nome;
    private List<Alunos> alunos = new ArrayList<Alunos>();

    public Turmas(long idTurma, String nome) {
        this.idTurma = idTurma;
        this.nome = nome;
    }

    public Turmas() {
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turmas{" +
                "idTurma=" + idTurma +
                ", nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}

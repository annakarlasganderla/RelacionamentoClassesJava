package com.company;

public class Alunos {
    private String nomeAluno;
    private long idAluno;
    private String cpf;
    private boolean matriculado;

    public Alunos(String nomeAluno, long idAluno, String cpf, boolean matriculado) {
        this.nomeAluno = nomeAluno;
        this.idAluno = idAluno;
        this.cpf = cpf;
        this.matriculado = matriculado;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", idAluno=" + idAluno +
                ", cpf='" + cpf + '\'' +
                ", matriculado=" + matriculado +
                '}';
    }
}

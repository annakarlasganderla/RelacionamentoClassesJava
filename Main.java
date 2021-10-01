package com.company;

public class Main {

    public static void main(String[] args) {

        Curso c1 = new Curso(1,"engenharia de software",true);
        Curso c2 = new Curso(2,"engenharia civil",true);

        Universidade u1 = new Universidade(1,"uniamérica");
        u1.getCursos().add(c1);  // a universidade e adiciono o curso c1
        u1.getCursos().add(c2);

        Turmas t1 = new Turmas(5,"1A");
        Turmas t2 = new Turmas(6,"1B");

        c1.getTurmas().add(t1);  // pego o curso c1 e adiciono a turma t1
        c2.getTurmas().add(t2);

        Alunos a1 = new Alunos("anna", 123,"123.456.789-74",true);

        t1.getAlunos().add(a1); // pego a turma t1 e adiciono o aluno a1

        System.out.println(u1);


    }
}

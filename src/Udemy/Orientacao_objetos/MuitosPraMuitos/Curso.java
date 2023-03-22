package Udemy.Orientacao_objetos.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome ;
    String Curso;
    List<Aluno> alunos= new ArrayList() ;

    void adicionarAluno (Aluno aluno ) {

        this.alunos.add(aluno);
    }

    Curso(String nome) {
        this.nome = nome;
    }
    void adicionaAluno (Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}











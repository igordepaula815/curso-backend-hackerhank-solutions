package Udemy.Orientacao_objetos.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome ;
    List<Curso> cursos= new ArrayList<>() ;

    Aluno(String nome) {
        this.nome = nome;
    }
    void adicionarCurso (Curso curso ) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
        public String toString () {    // converte para a saida string pra funcionar tem que ta no public
        return  nome;
  }

}



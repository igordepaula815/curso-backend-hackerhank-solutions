package Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada;

import Udemy.Orientacao_objetos.MuitosPraMuitos.Curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
 public    String nome ;
 public String nota;
    public List<Curso> cursos= new ArrayList<>() ;

    public Aluno(String nome) {
        this.nome = nome;
    }
    void adicionarCurso (Curso curso ) {
        this.cursos.add(curso);

    }
        public String toString () {    // converte para a saida string pra funcionar tem que ta no public
        return  nome;
  }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}



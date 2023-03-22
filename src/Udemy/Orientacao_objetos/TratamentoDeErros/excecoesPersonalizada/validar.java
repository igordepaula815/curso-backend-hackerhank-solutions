package Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada;

import Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada.Aluno;
import Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada._StringVaziaException;

public class validar {

    private validar() {
    }

    public static void aluno(Aluno aluno) {


        if (aluno == null) {
            throw new IllegalArgumentException("O alunoo esta nulo") ;
        }
        if ( aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new _StringVaziaException("nome") ;
        }


    }
}
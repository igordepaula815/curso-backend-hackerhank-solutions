package Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada;

import Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada.Aluno;
import Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada._StringVaziaException;
import Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada.validar;

public class TesteValidacoes {

    public static void main(String[] args) {

        Aluno aluno = null;
        try {
            aluno = new Aluno( "Ana");
            validar.aluno(aluno);
        } catch (_StringVaziaException e) {
            System.out.println(e.getmessage());;
        }
        System.out.println("fim");
    }
}

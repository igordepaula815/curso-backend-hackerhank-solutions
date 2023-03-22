package Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada;
// throw dentro ed um trow
public class Causa {
    public static void main(String[] args) {
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);    // relancando a excecao
        }
    }

    static void metodoB(Aluno aluno) {
  if (aluno == null) {
      throw     new NullPointerException("o aluno esta nulo") ;
                                                                  // NullPointerException é uma exceção lançada pelo
      // Java quando um programa tenta acessar um objeto de memória que não foi instanciado (ou melhor, inicializado)
      // até o momento de sua chamada. O que isso quer dizer? O objeto ainda está nulo, ele não tem um valor definido.
  }
        System.out.println(aluno.nome);


    }
}

package Udemy.Orientacao_objetos.encapsulamento_get_and_seter;

public class Pessoa {

     private int idade;
     private String nome;


     public Pessoa(String nome,int idade) {  // criar construtor public se coloca as variaveis dentro do ()
          setNome(nome);
          setIdade(idade);
     }

     // como ta em private oque se faz é cria um metodo para a outra classe poder somente ler a idade
     // getter
     public int getIdade() {  // criei um metodo se coloca getIdade com o mesmo nome da variavel, get é metodo para ler
          return idade;
     }
// metodo setter
     public void setIdade(int novaIdade) {   // metodo para alterar a idade // set vai para alterar
          novaIdade = Math.abs(novaIdade) ;  // MATH. ABS: Este método tem a função de retornar o valor absoluto de um número, isto significa que o retorno será sempre positivo. Caso seja informado um valor negativo à este método., ele retornará o mesmo como positivo. Por exemplo, caso utilizemos o valor -1234, ele será convertido para 1234.
          if (novaIdade >= 0 && novaIdade <= 120) {  // so aplica a nova idade se for maior que zero e novaidade tem que se menor ou igual a 120
               this.idade = novaIdade;
          }
     }

     public String getNome() {   // so criar a variavel e colocar no generate mais facil
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }
public String toString () {  // Acontece que o toString é invocado automaticamente quando tentamos imprimir um objeto usando métodos como print , println , format , entre outros. Ou, quando concatenamos um objeto com uma string usando o operador “+”
          return  " ola sou o " + getNome() + " tenho " + getIdade() + " anos ";
}

}


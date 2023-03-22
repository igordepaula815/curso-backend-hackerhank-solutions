package Udemy.Orientacao_objetos.encapsulamento_get_and_seter;

public class Pessoa_teste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("igor",35) ;  // usando construtor coloca nome e idade o math se colocar algo negativo ele altera
        p1.setIdade(20);   // usando metodo alterarIdade se usa o set para alterar


        System.out.println(p1.getIdade());  // agora consegue ler o metodo que ta em public na outra classe se usa o get
        System.out.println(p1);  // chamou o tostring
    }

}

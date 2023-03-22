package Udemy.Orientacao_objetos.Poliformismo_e_abstract;

public class JantarTeste {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.5) ;

        Arroz porcao1 = new Arroz(0.250) ;
        Feijao porcao2 = new Feijao(0.250) ;
        Sorvete Doce1 = new Sorvete(0.400) ;

        convidado.Comer(porcao1);
        convidado.Comer(porcao2);
        convidado.Comer(Doce1);
        System.out.println(convidado.getPeso());

    }
}

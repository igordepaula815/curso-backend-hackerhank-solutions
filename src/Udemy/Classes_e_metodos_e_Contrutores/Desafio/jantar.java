package Udemy.Classes_e_metodos_e_Contrutores.Desafio;

public class jantar {
    public static void main(String[] args) {

        //  estanciou e associou nome e peso da comida com a outra classe comida
        Comida c1 = new Comida("arroz",0.200) ;
        Comida c2 = new Comida( "feijao", 0.300) ;

        // estanciou agora com a classe pessoa numero n vai aspas
        Pessoa p1 = new Pessoa(" joao " , 80 ) ;
        //  apresentacao antes de comer
        System.out.println(p1.apresentar());

        //comeu
        p1.comer(c1) ;
        p1.comer(c2);

        System.out.println(p1.apresentar());
    }

    }

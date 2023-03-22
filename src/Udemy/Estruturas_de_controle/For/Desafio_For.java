package Udemy.Estruturas_de_controle.For;

public class Desafio_For {
    public static void main(String[] args) {

        String valor = "#" ;
        for ( int i = 0 ; i <= 5 ; i++ ) {
            System.out.println(valor);
        }
    // versao do desafio
        //nao pode usar valor numerico para controlar o laço

        for ( String v = "#" ; v.equals("######") ; v += "#") {
            System.out.println(v);
        }

    }




}

package Udemy.Estruturas_de_controle.While;

import java.util.Scanner;

public class Do_while {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;

        String texto = "" ;

        do {
            System.out.println("diga as palavras magicas");
            System.out.println("quer sair?");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor")) ;

        System.out.println("obrigado");


        entrada.close();
    }
}

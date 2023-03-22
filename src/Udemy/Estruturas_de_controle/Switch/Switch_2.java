package Udemy.Estruturas_de_controle.Switch;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;

        String conceito = "" ;
        System.out.print("Informe a nota" );
        int nota = entrada.nextInt();

        switch (nota) {
           // da pra juntar os cases se forem o mesmo conceito por exemplo
            case 10 : case 9:
                conceito = "A" ;
                break ;
            case 8:
            case 7:
                conceito = "b" ;
                break;
            default :
                conceito = " nao encontrado" ;
        }
        System.out.println( "conceito é " + conceito );




        entrada.close() ;

    }
}

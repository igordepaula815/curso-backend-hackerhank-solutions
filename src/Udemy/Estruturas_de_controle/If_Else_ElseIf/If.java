package Udemy.Estruturas_de_controle.If_Else_ElseIf;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;
        System.out.print("informe a nota");
        double media = entrada.nextDouble();
                      //a nota tem que ser menor que 10 pra valer e maior que 7 pra aprovar
        if (media <= 10 && media >= 7.0 ) {
            System.out.println("aprovado");
            System.out.println("parabens");
        }
        if( media < 7 ) {
            System.out.println("recuperacao");
}

        if (media < 4 ) {
          System.out.println("reprovado");
}

        entrada.close();
    }



}

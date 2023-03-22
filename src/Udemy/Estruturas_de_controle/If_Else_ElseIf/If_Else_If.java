package Udemy.Estruturas_de_controle.If_Else_ElseIf;

import java.util.Scanner;

public class If_Else_If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in) ;

        System.out.print("Digite a nota");

        double nota = entrada.nextDouble();
// se a nota for maior que 10 ou menor que zero é invalida - traduzindo o if  simbolo || é ou
        if ( nota > 10 || nota < 0 ) {
            System.out.println("nota invalida");
        } else if (nota >= 8) {
                System.out.println("Conceito A ");

        } else if (nota >= 6.1 ) {
                    System.out.println("conceito b");

        } else if (nota >= 4.1 ) {
                System.out.println("conceito c");
        }
        else {
            System.out.println("rodou");
        }
        System.out.println("fim");
        entrada.close();

        }



    }




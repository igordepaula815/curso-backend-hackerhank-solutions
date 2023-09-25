package Udemy.Estruturas_de_controle.For;


public class For_4 {

    public static void main(String[] args) {

        //Crie um programa que imprima os números pares de 1 a 100.

        for ( int contagem = 0; contagem <= 100; contagem += 2) {

            System.out.printf( " a contagem é %d ", contagem);
        }

        // Crie um programa que calcule a soma de todos os números de 1 a 100.

        int soma = 0;
        for ( int i = 0 ; i <100 ; i++) {
            soma += i ;

            System.out.println(soma);

        }

        //Crie um programa que imprima o quadrado de todos os números de 1 a 10.

        // Imprimindo o quadrado de todos os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }















    }


}









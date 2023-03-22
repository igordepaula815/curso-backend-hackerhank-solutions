package Udemy.Estruturas_de_controle.Array;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("quantas notas ");
        int Qtnotas = entrada.nextInt();

        double [] notas = new double[Qtnotas];

        for ( int i = 0; i < notas.length; i++) {
            System.out.print("informe a nota " + (i + 1) + ": ") ;
            notas[i] = entrada.nextInt();
        }
// Para converteres uma matriz do tipo int para uma string deverás fazer uso do método tostring
        System.out.println(Arrays.toString(notas));

        double total = 0 ;
        for (double nota : notas ) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println( " a media é " + media );

entrada.close();
    }














}
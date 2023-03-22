package Udemy.Estruturas_de_controle.Array;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        double[] Notas = new double [5] ;

        Notas [0] = 7.9;
        Notas [1] = 8;
        Notas [2] = 9.0;
        Notas [3] = 9.0;
        Notas [4] = 2;

        System.out.println(Arrays.toString(Notas));

        double total = 0 ;
        /* .leng ele automatiza o tamanho do arrays substtuindo o 3
         for (int i = 0; i  < 3; i++ */

        for (int i = 0; i < Notas.length;i++) {
            total += Notas[i];
        }

        System.out.println(Notas.length);
        System.out.println(Notas[1]);














}}

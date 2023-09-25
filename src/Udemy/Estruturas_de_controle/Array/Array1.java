package Udemy.Estruturas_de_controle.Array;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        double[] NotasAluno1 = new double [5] ;   // mudar nome de variaveis repetidas 2 cliques e vai no refactor

        NotasAluno1 [0] = 7.9;
        NotasAluno1 [1] = 8;
        NotasAluno1 [2] = 9.0;
        NotasAluno1 [3] = 9.0;
        NotasAluno1 [4] = 2;

        System.out.println(Arrays.toString(NotasAluno1));  // tranforma a saida numa string

        double total = 0 ;
        /* .leng ele automatiza o tamanho do arrays substtuindo o 3
         for (int i = 0; i  < 3; i++ */

        for (int i = 0; i < NotasAluno1.length;i++) {
            total += NotasAluno1[i];    // vai acrecentando e somando os numeros do array
        }

        System.out.println(NotasAluno1.length);
        System.out.println(NotasAluno1[1]);
        System.out.println(NotasAluno1[2]);
        System.out.println(NotasAluno1[4]);
        System.out.println(total);

        double TotalAluno2 = 0 ;
        double [] NotasAluno2 = { 10 , 5 , 5 ,6, } ;  //  tem esse jeito mais resumido de por tambem.
          for ( int i = 0 ; i < NotasAluno2.length ; i++) {
              TotalAluno2 += NotasAluno2[i];   // vai somando as notas pode deixar com ou sem

          }

        System.out.println(Arrays.toString((NotasAluno2)));
        System.out.println(NotasAluno2[1]);
        System.out.println(TotalAluno2);


















}}

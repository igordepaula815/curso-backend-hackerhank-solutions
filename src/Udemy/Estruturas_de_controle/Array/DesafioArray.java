package Udemy.Estruturas_de_controle.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("quantas notas");
          int qtdadeNota  = entrada.nextInt();

          double[] Notas = new double [qtdadeNota] ;

          for (int i = 0; i < Notas.length;i++) {
              System.out.print("Informe a nota");
              Notas[i] = entrada.nextInt() ;
          }

        double total = 0 ;
          for (double  nota : Notas) {
              total += nota ;
          }


          double media = total/ Notas.length;
        System.out.println( " a media é " + total );

        System.out.println(Arrays.toString(Notas));



        entrada.close();

    }
}
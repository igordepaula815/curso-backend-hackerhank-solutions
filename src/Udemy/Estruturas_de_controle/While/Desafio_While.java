package Udemy.Estruturas_de_controle.While;

import java.util.Scanner;

public class Desafio_While {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                    System.out.println("nota invalida");
                }
        }
        // calcular media

        double media = total / quantidadeDeNotas ;
        System.out.println("media é :" + media);
















        entrada.close();



    }}
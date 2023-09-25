package Udemy.Estruturas_de_controle.If_Else_ElseIf;

import java.util.Scanner;

public class Desafio_If {

    // nao se usa ; em estruturas de controle

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia");
        String Dia = entrada.next();
        /* para funcionar se usa equalsignore  dai ignora pode colocar maiuscula e minuscula acha domingo igual
        ele vai printar 1*/
        if (Dia.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        }

        else if  (Dia.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        }
        // caso o usuario digite com ç ou c
        else if  (Dia.equalsIgnoreCase("terça") || Dia.equalsIgnoreCase("terca")) {
            System.out.println(3);
        }
        else if  (Dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        }
        else if  (Dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        }
        else if  (Dia.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        }
        else {
            System.out.println("Dia Invalido");
        }








        entrada.close();


    }}











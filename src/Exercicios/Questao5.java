package Exercicios;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = input.nextLine();

        StringBuilder invertida = new StringBuilder(original).reverse();

        System.out.println("String invertida: " + invertida.toString());
    }
}


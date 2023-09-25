package Udemy.Estruturas_de_controle.If_Else_ElseIf;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        // Obert informaçao com o jop.showimput ele cria uma caixinha pra por o valor
        String valor = JOptionPane.showInputDialog("informe o numero");
        // transformar uma string para um inteiro
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {      // o % ve se o numero é par ou impar.
            System.out.println("E PAR");
        } else {
            System.out.println("E INPAR");
        }
    }
}

package Udemy.Estruturas_de_controle.While;

import java.util.Scanner;

public class while_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;

        String valor = "" ;

        // enquanto o valor nao for digitado "sair" nao sai do loop
        // while = enquanto ! = nao
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("voce diz");
            valor = entrada.nextLine();

        }









        entrada.close();
    }
}

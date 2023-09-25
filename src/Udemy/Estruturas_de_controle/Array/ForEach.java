package Udemy.Estruturas_de_controle.Array;
// foreach = paracada traducao para cada elemento faz um laço de repeticao
public class ForEach {   // traduçao para cada elemento seria
    public static void main(String[] args) {

        // jeito tradicional de chamar o for
        double[] notas = {5.5, 1.0, 9.9, 7.0, 8.5};

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + "");
        }
        System.out.println();

        // chamando for com foreach
        for(double nota : notas) {
        System.out.println(nota + "");
    }
    }
    }
package Exercicios;

public class questao1teste {
    public static void main(String[] args) {

        int INDICE = 13;
        int soma = 0;
        int k = 0;

        while (k < INDICE) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
        System.out.println(" A soma é" + soma);
        INDICE++ ;
    }
}

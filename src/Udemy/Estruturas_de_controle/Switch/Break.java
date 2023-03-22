package Udemy.Estruturas_de_controle.Switch;

public class Break {
    // exemplo simples de break

    public static void main(String[] args) {

        // int i contagem começa no 0 ; o i conta ate 10 ; encremento soma de 1 em 1
        for (int i = 0; i < 10; i++) {
           // quando i for = a 5 encerrar contagem
            if (i == 5) {
                break;
            }
            System.out.println( i );
        }
        System.out.println("fim");

    }}



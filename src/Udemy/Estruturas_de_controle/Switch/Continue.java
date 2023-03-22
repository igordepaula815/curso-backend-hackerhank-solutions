package Udemy.Estruturas_de_controle.Switch;

public class Continue {
    // continue ele funciona quando cai a contagem no numero indicado no caso o numero 5 no exemplo
    // pelo continue ele pula o 5 e continua a contagem ate o 10 no break ele sai do lao e vai para proxima linha

    public static void main(String[] args) {

        for ( int i = 0 ; i < 10; i++) {
            if ( i == 5)
                continue;
            System.out.println(i);
        }
    }

}

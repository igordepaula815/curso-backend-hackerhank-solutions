package Udemy.Estruturas_de_controle.Switch;

public class break_rotulado {
    public static void main(String[] args) {
// externo colocando o nome ele puxa po for externo
       externo: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; i++) {
                if ( i == 1) {
                    break externo;
            }
                System.out.printf("%d , %d" , i,j);
            }

            System.out.println();
        }
    }}


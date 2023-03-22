package Udemy.Classes_e_metodos_e_Contrutores.ExercicioData;

public class valorNulo {
    public static void main(String[] args) {

        String s1 = "";
// contat pra concatenar com a string vazia
        System.out.println(s1.concat("!!"));

//atribuiçao trenaria random e um valor aleatorio
        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if (d1 != null ) {
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }
    }
}

package Exercicios.Fundamentos;

public class VariaveisEConstantes {
    public static void main(String[] args) {
       //variaveis raio e pi
        final  double raio = 3.4 ;
        final  double pi = 3.1415;  // final é a constante ninguem pode mecher mais nesse valor
        double area = pi * raio * raio ;

        System.out.println(pi * raio * raio );
        System.out.println(area);
        System.out.println( "area = " + area + "m²" );


    }
}

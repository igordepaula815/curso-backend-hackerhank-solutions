package Exercicios.Fundamentos;

public class ExpressaoNumerica {

    public static void main(String[] args) {
         // Expreção numerica

        double numA = Math.pow(6* (3 +2) , 2) ;   // depois da virgula é em quanto vai ser elevado a potencia no caso o 2
        double denA =  3 * 2 ;

        double numB = (1-5 ) * (2-7) ;
        double denB = 2;     // na expreção e elevado a segunda potencia

        double superiorA = numA / denA ;
        double superiorB = Math.pow( numB / denB , 2) ;

        double superior = Math.pow(superiorA - superiorB , 3);          // na expressao é elevado a 3 potencia
        double inferior = Math.pow(10,3) ;                              // tb é elevado a terceira potencia

        double resultado = superior / inferior ;

        System.out.println( "o resultado é " + resultado );







    }



}

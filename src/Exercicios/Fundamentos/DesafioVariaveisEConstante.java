package Exercicios.Fundamentos;

public class DesafioVariaveisEConstante {

    public static void main(String[] args) {
// Celsius = (Fahrenheit - 32) * 5 / 9  formula para  converter o farenheit pra celcius
         final double ajuste = 32 ;
         final double fator = 5.0 / 9.0 ;      // tem que colocar 5.0 para ler
         double farenheit = 85;               // temperatura foi escolhida por min

          double Celcius = (farenheit - ajuste) * fator ;



        System.out.println(Celcius);







    }
}

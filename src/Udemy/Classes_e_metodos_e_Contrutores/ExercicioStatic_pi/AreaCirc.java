package Udemy.Classes_e_metodos_e_Contrutores.ExercicioStatic_pi;

public class AreaCirc {
    double raio;
   // STATIC O METODO E DA CLASSE E SO COLOCAR FINAL STATIC NAO CONSEGUEM ALTERAR O VALOR NA OUTRA CLASSE
    // final e uma constante coloca-se o valor tambem da variavel coloca e maiunsco o pi questao de convensao
   static final  double PI = 3.14 ;

    AreaCirc ( double raioInicial) {
        raio = raioInicial;

    }

    // construtor
    double area() {
        // math.pow faz raio ao quadrado. para chamar o match e o mesmo nome da classe pra n erra
        // COM O FINAL COLOCA O PI EM MAISCULO
        return PI * Math.pow(raio,2) ;
    }
// TEM COMO CRIA TAMBEM METODO STATIC EX

    static double area(double raio) {
        return PI * Math.pow(raio,2) ;



    }

    }





package Udemy.Orientacao_objetos.UmPraUm;

public class Carro {

    Motor motor = new Motor() ; // tributo de instacial se chama o motor para dizer que o carro tem um motor

    void acelerar (){              // metodo
        motor.fatorInjecao += 0.4 ;
    }

    void  freiar() {
        motor.fatorInjecao -= 0.4 ;
    }
   void ligar () {
        motor.ligado = true;
    }

    void desligado () {
        motor.ligado = false;
    }
    boolean estaLigado() {
        return motor.ligado;
    }




}

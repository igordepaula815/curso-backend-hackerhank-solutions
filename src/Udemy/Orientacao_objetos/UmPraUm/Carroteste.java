package Udemy.Orientacao_objetos.UmPraUm;

public class Carroteste {
    public static void main(String[] args) {

        Carro c1 = new Carro () ;   // estanciar um carro

        System.out.println(c1.estaLigado());  // perguntou se esta ligado retornou false pq n esta sendo usado

        c1.ligar(); // chamando metodo
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();  // somou 3x
        System.out.println(c1.motor.giros());


        c1.freiar();
        c1.freiar();
        c1.freiar(); // freiou 3x

        System.out.println(c1.motor.giros());



    }
}

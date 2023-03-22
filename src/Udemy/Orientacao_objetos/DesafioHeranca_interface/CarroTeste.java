package Udemy.Orientacao_objetos.DesafioHeranca_interface;

public class CarroTeste {
    public static void main(String[] args) {
        Civic c1 =   new Civic (200); // carro estanciado

        c1.acelerar();  // chamando o metodo acelerar 3 vezes
        System.out.println( c1 );

        c1.acelerar();
        System.out.println( c1 );

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);  // com o contrutor em ferrari ele pede uma velo maxima
        c2.ligarTurbo();                                            //liga o turbo aqui chamando o metodo
        c2.LigarAr();
        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        System.out.println(c2);




    }
}

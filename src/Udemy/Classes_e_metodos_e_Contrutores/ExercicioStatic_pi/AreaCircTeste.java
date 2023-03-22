package Udemy.Classes_e_metodos_e_Contrutores.ExercicioStatic_pi;

public class AreaCircTeste { public static void main(String[] args) {

    AreaCirc a1 = new AreaCirc(10) ;
   // a1.pi = 10;

    AreaCirc a2 = new AreaCirc(5) ;
    //a2.pi = 5;

// pra alterar o valor agora com o STATIC ativo é assim que se chama O ATRIBUTO STATICO
    //AreaCirc.pi = 3.1415;  nao vale mais por causa da variavel final dai n so pode trocar na classe main
    System.out.println(a1.area());

    // se quiser trocar o valor novamente e so fazer de novo que todos abaixo faram tb STATIC
    //AreaCirc.pi = 2 ;
    // DEPOIS DO FINAL STATIC SO SE PODE LER A INFORMACAO EX
    System.out.println(AreaCirc.PI);
    System.out.println(Math.PI);

    // COM O METODO STATIC DA PRA COLOCA DIRETO NO SYSTEM OUT O VALOR N PRECISA ESTANCIAR
    System.out.println(AreaCirc.area(100));

    }
}

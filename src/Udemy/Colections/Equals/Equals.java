package Udemy.Colections.Equals;

import Udemy.Colections.List.Usuario;

public class Equals {
    public static void main(String[] args) {

         Usuario u1 = new Usuario(" igor ", "igordepaula815@gmail.com");
         Usuario u2 = new Usuario(" jose","jjs@hotmail.com");

        System.out.println( u1 == u2);          // compara tb
        System.out.println( u1.equals(u2)) ;   // compara e retorna true ou false







    }
}

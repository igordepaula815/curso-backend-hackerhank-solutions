package Udemy.Colections.Hashset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_2 {
    public static void main(String[] args) {

        HashSet <String> ListaAprovados = new HashSet<>() ;

        ListaAprovados.add("Igor") ;
        ListaAprovados.add("Suelen") ;
        ListaAprovados.add("Charlie") ;
        ListaAprovados.add("jao") ;
        ListaAprovados.add("maria") ;

        // usando um foreach para a lista fica em formato e lista a saida
         for ( String candidato : ListaAprovados) {
             System.out.println(candidato);
         }

        // entrega em linha a saida
         System.out.println(ListaAprovados);



    }


}

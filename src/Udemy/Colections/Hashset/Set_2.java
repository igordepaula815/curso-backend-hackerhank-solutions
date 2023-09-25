package Udemy.Colections.Hashset;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_2 {

    public static void main(String[] args) {

        HashSet<String> ListaAprovados = new HashSet<>();  // so aceita list de strings

        ListaAprovados.add("Igor");      // crtl alt A para selecionar e alternar linhas muiltiplas
        ListaAprovados.add("Suelen");
        ListaAprovados.add("Charlie");
        ListaAprovados.add("jao");
        ListaAprovados.add("maria");
        ListaAprovados.add("maria");

        // usando um foreach para a lista fica em formato e lista a saida
        for (String candidato : ListaAprovados) {
            System.out.println(candidato);
        }

        // entrega em linha a saida
        System.out.println(ListaAprovados);


        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        for(  int N : nums) {
            System.out.println(N);
        }
            
        }
        


    }

package Udemy.Colections.HashMap;


import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

       // vao 2 valores no map key e value
        Map<Integer, String> usuarios = new HashMap() ;

        //o map inves de add ele usa o put ele add e altera chamando o put 

        usuarios.put(1,"igor") ;      // adc usando o put
        usuarios.put(1,"silva") ;    // Alterou usando o put
        usuarios.put(2,"carlos") ;
        usuarios.put(3,"dina") ;



         System.out.println(usuarios);
         System.out.println(usuarios.size());  // conta quantos tem
         System.out.println(usuarios.isEmpty()); // pergunta se a lista ta vazia
         System.out.println(usuarios.keySet()); // quantas {} tem no caso 3
         System.out.println(usuarios.values()); // passa os valores onde ta os nomes
         System.out.println(usuarios.entrySet()); // aparece a list
         System.out.println(usuarios.containsKey(20)); // se oque tem na linha 20

        // for each pra percorrer o laco das chaves no caso o primeiro que é o integer
        for ( int chaves : usuarios.keySet()) {
        System.out.println(chaves);
        }

        // for each para percorrer o values se coloca o tipo antes foi int agora string
        for ( String valor: usuarios.values()) {
            System.out.println(valor);
        }
        // for para colocar os 2 valores juntos

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());

        }





    }

}

package Udemy.Colections.List;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>() ;

        // adicionando novo usuario direto assim
        lista.add(new Usuario("Igor"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("thc"));
        lista.add(new Usuario("joana"));



        // percorrer o laço apresenta em lista com foreach
        // chama a classe usuario pra associa com list
        for (Usuario  u : lista) {
            System.out.println();

            // puxa o elemento 0 pelo indice
            System.out.println(lista.get(0));

            // chamando so o u bate la com o tostring
            System.out.println(u);
           // pergunta oque contem na lista respondendo com true ou false
            System.out.println(lista.contains("igor"));



        }

    }
}

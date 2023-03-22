package Udemy.Orientacao_objetos.UmpraMuitos;

import java.util.ArrayList;

public class Compra {
    String Cliente ;

    ArrayList<Item> itens = new ArrayList<Item>() ;


    double valorTotal() {  // metodo valor total
        double total = 0;

    // for each
        for ( Item item : itens) {
            total += item.quantidade * item.preco ;
                  }
         return total ;
    }
}




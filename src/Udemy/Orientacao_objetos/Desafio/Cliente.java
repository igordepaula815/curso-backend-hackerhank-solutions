package Udemy.Orientacao_objetos.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome ; // criar nome  quando se nao vai mudar nada pode colocar final
    final List<Compra> compras = new ArrayList<>();   //criando a relaçao com a classe compra

    public Cliente(String nome) {  // se faz um  construtor
        this.nome = nome;
    }

   void AdicionarCompra ( Compra compra) {   // adcionar o metodo compra
        this.compras.add(compra);
   }

    double obterValorTotal() {   //metodo
        double total = 0;
                                                                                 // leitura fo foreach
        for (Compra compra : compras) {           // começa o foreach chamando com o nome do array Compra dps pode colocar
          total += compra.obterValorTotal();                                       // qualquer nome no caso compra e o laco gira em tono do compras <Compra> compras o nome da list
        }
        return total;


    }
}

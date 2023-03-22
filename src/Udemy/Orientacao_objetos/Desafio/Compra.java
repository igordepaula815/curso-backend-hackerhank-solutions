package Udemy.Orientacao_objetos.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

  final List <Item> itens = new ArrayList<>();

    // no array se cria um metodo para simplificar

 void AdcionarItem (Produto p , int qtde) {
     this.itens.add(new Item(p , qtde)) ;

 }
 // alem de estanciar um intem se pode produtos
void AdicionarItem (String nome, double preco, int qtde) { // passando nome preco qtde ja pra adc um produto
    var produto = new Produto(nome, preco);    // estanciou um produto e passou pra dentro do item
    this.itens.add(new Item(produto, qtde));    // adicionando item e ja adiona tudo nos item dessa compra
        
 }


 double obterValorTotal () {
     double total = 0 ;

     for ( Item item : itens) {
         total += item.quantidade * item.produto.preco ;
     }
     return total ;

 }



}



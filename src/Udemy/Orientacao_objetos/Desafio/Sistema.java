package Udemy.Orientacao_objetos.Desafio;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.AdicionarItem("caneta azul",8.50,50);                     // ja se coloca direto pq ja foi criado no metodo
        compra1.AdcionarItem(new Produto("note",122),10);         // no adc item coloca produto p depoise se coloca no nomw preco qtde


        Compra compra2 = new Compra();
        compra1.AdicionarItem("caderno",5.50,10);                     // ja se coloca direto pq ja foi criado no metodo
        compra1.AdcionarItem(new Produto("tv",1000),10);

        Cliente cliente = new Cliente("maria");
        cliente.AdicionarCompra(compra1);   // usando o metodo adicionar compra da classe cliente
        cliente.compras.add(compra2);       // assim chama sem o metodo

        System.out.println(cliente.obterValorTotal());



    }
}

package Udemy.Orientacao_objetos.Desafio;

public class Item {

    Produto produto;// item aponta para o construtor de produto
    int quantidade;

    public Item(Produto produto, int quantidade) { // criasse um construtor tb
        this.produto = produto;
        this.quantidade = quantidade;
    }
}


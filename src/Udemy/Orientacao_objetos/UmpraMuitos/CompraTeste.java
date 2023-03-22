package Udemy.Orientacao_objetos.UmpraMuitos;

public class CompraTeste {
    public static void main(String[] args) {

          Compra Compra1 = new Compra() ;
          Compra1.Cliente = "joao pedro" ;

          Compra1.itens.add(new Item("caneta" , 20 , 7.45)) ; // construtor da classe item
          Compra1.itens.add(new Item("papel" , 20 , 1.0)) ;
          Compra1.itens.add(new Item("borracha" , 20 , 0.50)) ;

        System.out.println(Compra1.itens.size()); // quantos itens tem
        System.out.println(Compra1.valorTotal());



    }
}

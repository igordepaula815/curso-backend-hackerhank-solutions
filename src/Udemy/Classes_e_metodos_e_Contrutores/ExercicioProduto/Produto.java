package Udemy.Classes_e_metodos_e_Contrutores.ExercicioProduto;

public class Produto {


    String nome ;
    double preco;
  //colocando o static o construtor n precisa passar o paratametro de desconto
   static double desconto ;
   // CRIANDO CONSTRUTORES - principal diferença que o contrutor nao tem retorno igual ao metodo
   // entre ( criando um paremetro no caso o nomeinicial ao lado do metodo na class teste
    Produto (String nomeInicial,double precoInicial) {
        nome = nomeInicial ;
        preco = precoInicial;

    }
    // com o construtor vazio se pode ter o metodo sem precisar passar o parametro obrigatoriamente
    Produto () {

    }

    // CRIANDO UM METODO
    // oque retorna no caso um double - nome do metodo - (parametros) { corpo do metodo}
    // tem como colocar mais um parametro se quiser entro os ()
    double precoComDesconto(double descontoDoGerente ) {
        return preco * (1 - desconto - descontoDoGerente) ;
    }
    // tem como duplicar o metodo para funcionar os 2
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
    }

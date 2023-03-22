package Udemy.Classes_e_metodos_e_Contrutores.ExercicioProduto;

public class ProdutoTeste {
    public static void main(String[] args) {
        // colocando parametro explissito para tudo em uma linha so com construtor
        Produto p1 = new Produto("Notebook",4000.00);


        Produto p2 = new Produto();
        // aqui construtor sem parametro
        p2.nome = "Caneta Azul" ;
        p2.preco = 10.00;
        // como ta em static coloca produto.desconto    ja que no static
        Produto.desconto = 0.10 ;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        // no precofinal1 esta o retorno do metodo criado na classe produto pertence a outra clase
        double PrecoFinal1 = p1.precoComDesconto(0.2) ;
        // modo antigo precisando fazer o calculo com o metodo pronto ja entrega feito
        double PrecoFinal2 = p2.preco * (1 * Produto.desconto) ;

        double mediaCarrinho = PrecoFinal1 + PrecoFinal2 / 2;

        // aqui as variaveis que quiser imprimir

        // entre () o desconto do gerente foi colocado em double no exemplo com um extra de 0.1  (10 porcento)
        System.out.println(p1.precoComDesconto(0.1));
        System.out.println(p2.precoComDesconto(0.1));
        System.out.println(p1.precoComDesconto());
    }
    }

package Udemy.Estruturas_de_controle.Switch;

public class Switch_1 {
    public static void main(String[] args) {
        // a variavel no caso e a "faixa" nesse exemplo, conforme muda, muda a busca entre as "" para pesquisar as faixas
        String faixa = "preta" ;
        // tolowercase transforma a saida tudo em minuscula as letras no que for colocado na busca
        switch ( faixa.toLowerCase()) {
            case "preta":
                System.out.println( "sei o Bassai-dai");
                // o break para o resultado para nao escrever todos os resultados da maquina.
                break;
               // as proximas condicionais se completa com case
            case "marrom" :
                System.out.println(" sei o tekki shodam" );
                break;
            case "roxa" :
                System.out.println("heiam odea");
                break;
            case "vermelha" :
                System.out.println("sei yodam");
                 break;
            case "verde" :
                System.out.println("sei yodam");
                break;
        }
        System.out.println("fim");

    }




}

package Udemy.Classes_e_metodos_e_Contrutores.ExercicioData;

public class Data {

    int dia;
    int mes;
    int ano;


    String obterDataFormatada() {
        //String.format ajeita para converter colocar uma data dentro de um texto
        // o this se refere a esse dia
        // em acao a variacao formato que era antes %d%d%d
        return String.format(formato, this.dia, mes, ano);
    }

    // construtor padrao
    Data() {
        // pode chamar o this assim tambem
        this(02, 07, 1987);
    }

    // construtor para receber codigo direto nos parametros na classe teste ficando tudo em uma linha
    Data(int dia, int mes, int ano) {
        // o this se refere ao valor recebido como parametro no return podendo duplicar o nome n haver conflito de nomes
        // o parametro e o atributo podem receber o mesmo nome usando this , n pode usar this onde tem metodo static
        // so pode ser usado em construtor
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimirDataformatada() {
        System.out.println(this.obterDataFormatada());
    }
// uma variavel pode ser local ( dentro do metodo) ou da classe (fora do metodo) no exemplo esta fora vale para toda a classe
    String formato = "%d,%d,%d" ;
}
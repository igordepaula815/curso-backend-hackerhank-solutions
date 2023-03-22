package Udemy.Classes_e_metodos_e_Contrutores.ExercicioData;

public class DataTeste {
    public static void main(String[] args) {

        // codigo com o construtor indicando tu em uma linha
        Data d1 = new Data(7,11,1987);


        // (%d LEMBRAR DE COLOCAR EM MODO INT NA CLASSE NAO TESTE) exibir em numeros inteiros \n quebra linha
        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);

        // construtor padrao fica assim
        Data d2 = new Data();

        d2.dia = 2;
        d2.mes = 12;
        d2.ano = 2000;
        //%d exibir em numeros inteiros
        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);

        //METODO
        String obterDataformatada = d1.obterDataFormatada();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());




    }


}
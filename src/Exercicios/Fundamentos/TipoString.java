package Exercicios.Fundamentos;

public class TipoString {
    public static void main(String[] args) {


        var nome = "Igor";
        var sobrenome = "Silva";
        var idade = 36;
        var salario = 5.000;

        // tem 2 jeitos

        System.out.println(" nome " + nome + " sobrenome " + sobrenome + " idade " + idade + " salario \n" + salario );

        // ou com formart   %s Sao string - %d   Sao int - %f pontos flutuantes  - 2f depois do ponto fica somente 2 casas decimais

        System.out.printf("\n O senhor %s %s tem %d anos  e recebe R$%f por mes\n ", nome, sobrenome, idade, salario);

        String frase = String.format( " O senhor %s %s tem %d anos  e recebe R$%f por mes ", nome, sobrenome, idade, salario);

        System.out.println(frase);



} }
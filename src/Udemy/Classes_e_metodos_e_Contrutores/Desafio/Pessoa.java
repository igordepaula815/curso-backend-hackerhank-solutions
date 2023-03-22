package Udemy.Classes_e_metodos_e_Contrutores.Desafio;

public class Pessoa {

    String nome ;
    double peso;
// criar construtor
    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }



    // cria metodo comer retornar void , vai receber parametro Comida recebe comida
void comer (Comida comida) {
// se tiver diferente do nulo
    if (comida != null) {
        // acrecentar peso da comida a peso da pessoa
        this.peso += comida.peso;
    }
}
String apresentar () {
            return "Olá sou o " + nome + " e tenho " + peso + " kgs " ;
    }




}



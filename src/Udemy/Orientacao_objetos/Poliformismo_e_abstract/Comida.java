package Udemy.Orientacao_objetos.Poliformismo_e_abstract;
// AQUi na classe mae dos extends , colocar abstract para nao ter como ser alterado fora dessa classe oque foi criado
// o usuario nao pode fazer alteracoes aqui n caso arroz e feijao ate pode estancia sem altera
public abstract class Comida {

    private double peso;

    public Comida(double peso) { // construtor
        this.peso = peso;
    }

    // chamando get and set
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {   // peso tem que se maior ou igual a 0 n deixa pesa menos que 0
            this.peso = peso;
        }
    }
}



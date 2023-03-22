package Udemy.Orientacao_objetos.Poliformismo_e_abstract;

public class Sorvete extends Comida {

    public Sorvete(double peso) {
        super(peso);   // so chamar o super que ja associa tudo
    }
}








    /*   o comentado e sem o extends  usando variavel private e get and seter
    private double peso;
 get and set e private sao usados sem poliformismos
    public Sorvete(double peso) { // construtor
        this.peso = peso;
    }
 chamando get and set
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {   // peso tem que se maior ou igual a 0 n deixa pesa menos que 0
            this.peso = peso;
        }

    }
}
*/
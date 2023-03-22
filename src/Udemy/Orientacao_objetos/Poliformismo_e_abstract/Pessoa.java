package Udemy.Orientacao_objetos.Poliformismo_e_abstract;

public class Pessoa {

    private double peso;

    // meotodo comer com o extends pode colocar eu tudo em um unico metodo
    public void Comer (Comida comida) {   // agora o pessoa come comida com o extends
        this.peso += comida.getPeso() ;
    }

    /*public void comer (Arroz arroz) {  // recebe arroz como para metro
    this.peso += arroz.getPeso() ;  // peso vai ser acrencentado ao arroz
}

    public void comer (Feijao feijao) {
        this.peso += feijao.getPeso() ;
    }
    public void comer (Sorvete sorvete) {
        this.peso += sorvete.getPeso() ;
    }
*/

    public Pessoa(double peso) { // construtor
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
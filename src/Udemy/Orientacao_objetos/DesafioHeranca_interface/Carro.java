package Udemy.Orientacao_objetos.DesafioHeranca_interface;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;   // criar variavel
    private int Delta = 5;    //Variavel pra susbstituit o 5 tem que colocar get and set para funcionar com private

    Carro(int velocidadeMaxima) { // contrutor
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {              // criando metodo
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA)  // se velocidade atual mais 5 for maior que VELOCIDADE MAXIMA,
            velocidadeAtual = VELOCIDADE_MAXIMA;  // velocidade atual n passa de VELOCIDADE MAXIMA
            velocidadeAtual += getDelta();     // acelera a  velocidade do carro em 5km  usando o metodo da classe
                                                //  ferrari oque foi o get
    }



    void frear() {
        if(velocidadeAtual >= 5 )       // se a velocidade foi += a 5 ele freia
        velocidadeAtual -= 5;
        else velocidadeAtual = 0 ;  // caso contrario ficar em zero
    }

 public String toString () {   // tostring retorna uma string
        return " velocidade atual " + velocidadeAtual + " km ";


}

    public int getDelta() {
        return Delta;
    }

    public void setDelta(int delta) {
        Delta = delta;
    }
}

package Udemy.Orientacao_objetos.Poliformismo_e_abstract;

public class Arroz extends Comida {  // chamando no poliformismo , com ele nao precisa o private e o get and set
                                     // pq ja herda no extends


    public Arroz (double peso ) {   // unica coisa que tem a fazer e chamar o super no construtor para erdar tudo
    super(peso);
    }
}


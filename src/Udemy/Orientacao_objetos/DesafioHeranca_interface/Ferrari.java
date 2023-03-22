package Udemy.Orientacao_objetos.DesafioHeranca_interface;
// quando coloca o implements tem que colocar o metodo da interface aqui
public class Ferrari  extends Carro implements Esportivo , Luxo {    // esportivo e luxo sao as interfaces pedem os metodos

    private boolean ligarTurbo = false; // para nao colocar set varias vezes criei esse boolean para melhor implementacao.
    private boolean ligarAr = false;

    public Ferrari(int velocidadeMaxima) { // chamando contrutor
        super(300);
        setDelta(15);   // pode varia veriavel  set por causa do private
    }

    @Override    // chamando override criando metodo
    void acelerar() {
       velocidadeAtual += 15;

    }

    @Override
    public void ligarTurbo() {
     ligarTurbo = true ; // chamando o a variavel boolean

        //setDelta(35);     // ligando turbo delta vai a 35  set para alterar o valor quando ligar o turbo
    }

    @Override
    public void desligarTurbo() {
       ligarTurbo = false;

        // setDelta(15);  // desligar turbo vai a 15 de novo . colocado o set pq ta private
    }

    @Override
    public void LigarAr() {
      ligarAr = true;
    }

    @Override
    public void DesligarAr() {
        ligarAr = false ;
    }

    public int getDelta () {    // criasse o metodo getdelta para todas possiveis situaçoes com o turbo e o ar
        if ( ligarTurbo && !ligarAr) {   // se o ligarTurbo e o ligarAr tiver desligado entregar 45.
            return 45 ;
        } else if ( ligarTurbo && ligarAr) {  // os 2 ligado entrega 40
            return 40;
        } else if (!ligarTurbo && !ligarAr ) { // os 2 desligados retornar 35
            return 35;
        } else {  // caso contrario retorna o velocidade 15 que é a padrao
            return 15;
        }
    }

}


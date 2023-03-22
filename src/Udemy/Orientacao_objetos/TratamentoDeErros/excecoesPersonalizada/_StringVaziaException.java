package Udemy.Orientacao_objetos.TratamentoDeErros.excecoesPersonalizada;

public class _StringVaziaException extends RuntimeException{

    private String nomeDoAtributo;

    public _StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo ;
    }

    public String getmessage() {
        return String.format(" o atributo esta errado" ,nomeDoAtributo) ;  // O método format da classe String nada mais
                                                             // é que um método estatico utilizado para formatar textos
    }


}

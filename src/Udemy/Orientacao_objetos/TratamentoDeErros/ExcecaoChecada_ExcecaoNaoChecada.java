package Udemy.Orientacao_objetos.TratamentoDeErros;

public class ExcecaoChecada_ExcecaoNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();  //chamando o metodo
        } catch (Exception e) {
            System.out.println(e.getMessage());   // TRATANDO O ERRO
        }

        try {
            geraErro2();   // TRATANDO ERRO CHAMAR TRY CATH NO CTRL ALT T
        } catch (Exception e) {
            System.out.println(e.getMessage());    // lembra de colocar isso manuamente
        }

        System.out.println("fim");
    }

       static void geraErro1() { // NAO VERIFICADO
       throw  new RuntimeException("Ocorreu um erro PQP") ; // lance o erro runtimeexption traduzido. lancar = throw
                                                          // a msg do erro sai no console trata com try cath se quiser
        }
// VERIFICADO
        static void geraErro2() throws Exception { // O EXCEPTION TEM QUE SER CHECADO DAI USA O THROWS EXCEPTION
                 throw  new Exception("Ocorreu um erro2") ;  // EXCEPTION TEM QUE DECLARAR THROW
        }



}




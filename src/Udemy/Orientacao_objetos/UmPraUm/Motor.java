package Udemy.Orientacao_objetos.UmPraUm;

public class Motor {
    boolean ligado = false ;
    double fatorInjecao = 1 ;

    int giros () {
        if(!ligado) {
            return 0;
        }
        else {  // se poe entra () o int para ele converter
            return (int) Math.round(fatorInjecao * 3000) ;  //A função Math. round() retorna o valor de um
                                                            // número arredondado para o inteiro mais proximo.

        }
    }
}

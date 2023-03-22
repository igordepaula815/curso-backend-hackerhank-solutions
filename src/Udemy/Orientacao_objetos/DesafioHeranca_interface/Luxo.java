package Udemy.Orientacao_objetos.DesafioHeranca_interface;

public interface Luxo {

    void LigarAr () ;
    void DesligarAr ();


    // colocando default antes do tipo do metodo nao é obrigado a usalo na classe que esta indo o implements
    default int nivelAr () {
        return 1;
    }

}

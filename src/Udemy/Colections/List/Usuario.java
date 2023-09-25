package Udemy.Colections.List;

import java.util.Objects;

public class Usuario {

    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(  String nome , String email) {

    }

    // esse metodo tostring quando algum usuario imprimir o nome vai sair a senteça "o nome é"
    public String toString() {
       return " O nome é " + this.nome;
    }

    // equals e hashcode  equals para poder repetir ou algum objeto e hashcode localiza por numero de letras
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuarioL = (Usuario) o;
        return Objects.equals(nome, usuarioL.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

package Udemy.Colections.Stack_pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add(" o pequeno principe") ;
        livros.push(" brasileirinhas") ;
        livros.add(" O hoobit") ;
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.contains("brasileirinhas"));




    }



    }

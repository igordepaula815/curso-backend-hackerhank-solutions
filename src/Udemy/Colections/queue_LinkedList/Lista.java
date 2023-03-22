package Udemy.Colections.queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Lista {
    public static void main(String[] args) {

        Queue<String> Fila = new LinkedList<>() ;   // linkedlist representa a queue

        // offer e add -> adicionam elementos na fila
        // diferença ocorre quando a fila esta cheia

        Fila.add("ana") ; // retorna problem quando a fila esta cheia
        Fila.add("maria") ; // retorna false ou false se a fila estiver cheia
        Fila.offer("ana") ;
        Fila.offer("joao") ;


        System.out.println(Fila);

        // peek e element = obter o proximo elemento da fila sem remover
        // diferença quando a fila esta cheia

        System.out.println(Fila.peek()); // retorna false
        System.out.println(Fila.element()); // lacao uma excecao
        System.out.println(Fila.poll()); // vai rolando a fila e removendo mas n remove completamente
        System.out.println(Fila.poll());
        System.out.println(Fila.remove("joao"));


    }
}

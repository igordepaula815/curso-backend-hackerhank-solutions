package Udemy.Colections.Hashset;

import java.util.HashSet;

// colections nao se vai primitimos ex integer
public class Set {
    public static void main(String[] args) {

        HashSet<Object> conjunto = new HashSet<>();

        conjunto.add(2.0) ;
        conjunto.add("tusushima") ;
        conjunto.add("motley crul") ;
        conjunto.add("x") ;
        conjunto.add("cheetos") ;

        // .size diz quantos tem no caso 5 no ex
        System.out.println("tamanho do conjunto é" + conjunto.size());
        // le oque tem no conjunto
        System.out.println("tamanho do conjunto é" + conjunto);

        java.util.Set<Object> nums = new HashSet<>() ;

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        // junta tudo   conjunto. chama todas as variaveis
        conjunto.addAll(nums) ;

        conjunto.remove("x") ;
        System.out.println(conjunto);

       // consulta algum objeto pra ver se contain retorna com true ou falso
        System.out.println(conjunto.contains(1));





    }
}

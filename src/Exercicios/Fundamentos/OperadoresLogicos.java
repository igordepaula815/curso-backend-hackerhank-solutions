package Exercicios.Fundamentos;

public class OperadoresLogicos {

    public static void main(String[] args) {
// treinando tabela verdade :


        boolean  trabalho1 =  false ;       // altera entre false e true para alterar os resultatos no system.out
        boolean  trabalho2 =  false ;

        boolean comproTV50 = trabalho1 && trabalho2 ;   // e
        boolean comprouTV32 = trabalho1 ^ trabalho2 ;  // conjunção
        boolean comprouSorvete = trabalho1 || trabalho2 ;  // ou

        System.out.println(comproTV50);
        System.out.println( comprouTV32 );
        System.out.println( comprouSorvete);

        int a = 10;
        a += 5; // a = a + 5
        a *= 2; // a = a * 2

// Operadores aritméticos
        int b = 20;
        int c = a + b; // c = 30
        int d = a - b; // d = -10
        int e = a * b; // e = 200
        int f = a / b; // f = 0.5
        int g = a % b; // g = 0

// Operadores relacionais
        boolean x = a == b; // x = false
        boolean y = a != b; // y = true
        boolean z = a > b; // z = false
        boolean w = a < b; // w = true
        boolean v = a >= b; // v = false
        boolean u = a <= b; // u = true

// Operadores lógicos
        boolean q = (a > b) && (a < 10); // q = false
        boolean r = (a > b) || (a < 10); // r = true
        boolean s = !q; // s = true









    }
}

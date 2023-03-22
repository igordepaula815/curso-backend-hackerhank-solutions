package Udemy.Orientacao_objetos.MuitosPraMuitos;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ("joao");
        Aluno aluno2 = new Aluno ("maria");
        Aluno aluno3 = new Aluno ("anita");

        Curso curso1 = new Curso("Java") ;
        Curso curso2 = new Curso("Word") ;
        Curso curso3 = new Curso("HTML") ;

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);


        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for ( Aluno aluno: curso3.alunos) {
            System.out.println(" estou matriculado no curso " + curso3.nome);
            System.out.println(" o meo nome é " + aluno.nome);
        }

    
    }


}

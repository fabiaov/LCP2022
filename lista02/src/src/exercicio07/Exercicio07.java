package exercicio07;

import exercicio07.entities.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno("Chopper", 25, 1, "Medicina");
        Aluno aluno2 = new Aluno("Sanji", 20, 2, "Gastronomia");
        Aluno aluno3 = new Aluno("Zoro", 23, 3, "Geografia");
        Aluno aluno4 = new Aluno("Lufy", 19, 4, "Educação Física");
        Aluno aluno5 = new Aluno("Brook", 19, "Musica");

        try {
            ListaAlunos alunos = new ListaAlunos();
            alunos.adicionaAluno(aluno1);
            alunos.adicionaAluno(aluno2);
            alunos.adicionaAluno(aluno3);
            alunos.adicionaAluno(aluno4);
            alunos.adiciona(aluno5);
            System.out.println(alunos);
            System.out.println("-----------------------------------");
            alunos.removeAluno(aluno3);
            System.out.println("-----------------------------------");
            alunos.adicionaAluno(aluno5); // erro para adicionar aluno sem RA
//            alunos.removeAluno(aluno5); erro ao remover aluno sem RA
//            sc.close();
        } catch (RuntimeException error) {
            System.out.println(error);
        }
    }
}

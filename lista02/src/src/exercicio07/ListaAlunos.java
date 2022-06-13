package exercicio07;

import exercicio07.entities.Aluno;

import java.util.ArrayList;
import java.util.List;

public class ListaAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void adiciona (Aluno aluno) {
        this.alunos.add(aluno);
    }
    public void remove (Aluno aluno) {
        this.alunos.remove(aluno);
    }
    public void adicionaAluno (Aluno aluno) {
        if (aluno.getRa() == null) {
            throw new RuntimeException("RA não Existente!");
        }
        this.alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }
    public void removeAluno (Aluno aluno) {
        if (aluno.getRa() == null) {
            throw new RuntimeException("Não existe este aluno para ser removido");
        }
        this.alunos.remove(aluno);
        System.out.println("O aluno " + aluno + "foi removido com sucesso!");
    }

    @Override
    public String toString() {
        return "ListaAlunos { " +
                "alunos: " + alunos +
                " }";
    }
}

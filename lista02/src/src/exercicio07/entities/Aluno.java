package exercicio07.entities;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer idade;
    private Integer ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, Integer idade, Integer ra, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
        this.curso = curso;
    }
    public Aluno(String nome, Integer idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }


    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getRa(), aluno.getRa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRa());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ra=" + ra +
                ", curso='" + curso + '\'' +
                '}';
    }
}

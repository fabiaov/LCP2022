package entities;

public class Cachorro extends Animal {
    private String nome;
    private int idade;

    public Cachorro() {
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void talk() {
        System.out.println("Au au!");
    }

    @Override
    public String toString() {
        return "Nome " +
                getNome() + ", "+
                " idade: " +
                getIdade() + ", "+
                " Pode Correr";
    }
}

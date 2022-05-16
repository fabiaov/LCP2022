package entities;

public abstract class Animal {
    private String nome;
    private int idade;
    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void talk();


}

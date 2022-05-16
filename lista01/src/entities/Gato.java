package entities;

public class Gato extends Animal {
    private String nome;
    private int idade;

    public Gato() {
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    public Gato (String nome, int idade) {
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
        System.out.println("Miau!");
    }
    @Override
    public String toString() {
        return "Nome " + getNome() + ", " + " idade: " + getIdade() + ", " + " Pode Correr e pular";
    }

}

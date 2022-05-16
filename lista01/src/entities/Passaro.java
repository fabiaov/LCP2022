package entities;

public class Passaro extends Animal {
    private String nome;
    private int idade;

    public Passaro() {
    }

    public Passaro(String nome) {
        this.nome = nome;
    }

    public Passaro(String nome, int idade) {
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
        System.out.println("Piu!");
    }

    @Override
    public String toString() {
        return "Nome " + getNome() + ", " + " idade: " + getIdade() + ", " + " Pode Voar";
    }

}

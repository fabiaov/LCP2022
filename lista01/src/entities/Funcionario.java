package entities;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;


    public Funcionario (){}

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    private Double getContribuicao () {
        if (getIdade() < 30) {
            return  0.2;
        } else if (getIdade() >= 30 && getIdade() < 40) {
            return 0.18;
        } else if (getIdade() >= 40 && getIdade() < 50) {
            return 0.12;
        } else if (getIdade() >= 50 && getIdade() <= 60) {
            return 0.07;
        } else {
            return 0.03;
        }
    }

    public double atualizaSalarioComContribuicao () {
        if (getSalario() <= 5000) {
            return this.salario -= this.salario * getContribuicao();
        }
        return this.salario -= (5000 * getContribuicao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

import entities.Funcionario;

public class Exercicio03 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Jose", 20, 4000.0);
        Funcionario func2 = new Funcionario("Maria", 35, 5000.0);
        Funcionario func3 = new Funcionario("Alfred", 40, 7000.0);
        Funcionario func4 = new Funcionario("Damian", 51, 6000.0);
        Funcionario func5 = new Funcionario("Bartolomeo", 62, 2000.0);

        System.out.println("salario dos funcionarios com desconto das contribuições: ");
        System.out.println("Jose : " + func1.atualizaSalarioComContribuicao());
        System.out.println("Maria : " + func2.atualizaSalarioComContribuicao());
        System.out.println("Alfred : " + func3.atualizaSalarioComContribuicao());
        System.out.println("Damian : " + func4.atualizaSalarioComContribuicao());
        System.out.println("Bartolomeo : " + func5.atualizaSalarioComContribuicao());
    }
}

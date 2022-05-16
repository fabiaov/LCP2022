package Exercicio05;

import entities.Livro;
import entities.LivroGratuito;
import entities.LivroPago;

public class Biblioteca {
    public static void main(String[] args) {
        Livro book1 = new LivroGratuito();
        Livro book2 = new LivroPago();
        book1.setTitulo("Harry Potter e as Relíquias da Morte");
        book2.setTitulo("Tokkien: O Senhor dos Anéis");


        System.out.println("------------------------------------");
        System.out.println(book1);
        System.out.println("------------------------------------");
        System.out.println(book2);

    }
}

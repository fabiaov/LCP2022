package Exercicio06;

import entities.geometria.Circulo;
import entities.geometria.Quadrado;
import entities.geometria.Retangulo;
import entities.geometria.Triangulo;

public class TestaGeometria {
    public static void main(String[] args) {
        Quadrado square = new Quadrado(2.0);
        Retangulo ret = new Retangulo(2.0, 4.0);
        Triangulo triang = new Triangulo(2.0, 2.0, 4.0);
        Circulo circ = new Circulo(4.0);

        System.out.println("----------------------------------------");
        System.out.println(circ);
        System.out.println("----------------------------------------");
        System.out.println(ret);
        System.out.println("----------------------------------------");
        System.out.println(square);
        System.out.println("----------------------------------------");
        System.out.println(triang);
        System.out.println("----------------------------------------");
    }
}

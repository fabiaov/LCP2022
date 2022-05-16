package entities.geometria;

import Interfaces.Geometria;

public class Triangulo implements Geometria {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo() {
    }

    public Triangulo(Double vertice1, Double vertice2, Double vertice3) {
        this.lado1 = vertice1;
        this.lado2 = vertice2;
        this.lado3 = vertice3;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public Double defineArea() {
        return (this.lado1 + this.lado2 + this.lado3) / 2;
    }

    @Override
    public Double definePerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n" +
                " lado1 = " + lado1 +
                " lado2 = " + lado2 +
                " lado3 = " + lado3 +
                ", area = " + defineArea() +
                ", Perimetro = " + definePerimetro() +
                "\n";
    }
}

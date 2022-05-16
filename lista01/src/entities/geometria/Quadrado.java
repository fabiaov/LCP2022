package entities.geometria;

import Interfaces.Geometria;

public class Quadrado implements Geometria {
    private Double side;

    public Quadrado() {
    }

    public Quadrado(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }


    @Override
    public Double defineArea() {
        return this.side * this.side;
    }

    @Override
    public Double definePerimetro() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Quadrado: \n" +
                " lados = " + this.side +
                ", area = " + defineArea() +
                ", Perimetro = " + definePerimetro() +
                "\n";
    }
}

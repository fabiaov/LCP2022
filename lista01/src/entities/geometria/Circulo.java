package entities.geometria;

import Interfaces.Geometria;

public class Circulo implements Geometria {
    private Double raio;
//    private final Double diametro = 2 * raio;

    public Circulo() {
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double defineArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    @Override
    public Double definePerimetro() {
        return  (2 * this.raio) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo: \n" +
                " raio = " + raio +
                ", diametro = " + 2 * raio +
                ", area = " + defineArea() +
                ", Perimetro = " + definePerimetro() +
                "\n";
    }
}

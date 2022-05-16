package entities.geometria;

import Interfaces.Geometria;

public class Retangulo implements Geometria {
   private Double altura;
   private Double largura;

    public Retangulo() {
    }

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double defineArea() {
        return altura * largura;
    }

    @Override
    public Double definePerimetro() {
        return (this.altura * 2) + (largura * 2);
    }

    @Override
    public String toString() {
        return "Retangulo: \n" +
                " altura = " + this.altura +
                ", largura = " + this.largura +
                ", area = " + defineArea() +
                ", Perimetro = " + definePerimetro() +
                "\n";
    }
}

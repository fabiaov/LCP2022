public class Exercicio07 {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;
        double z = 4;
        double w = 5;

        Double resultado = calculo(x,y,z,w);
        System.out.println(resultado);


    }
    public static Double calculo(double x, double y, double z, double w) {
        return (x + Math.pow(y, 2) + Math.pow(z, 3) + Math.pow(w, 4));
    }
}

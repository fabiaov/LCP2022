import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero: ");
        int x = sc.nextInt();
//        Double valorFinal = Double.parseDouble(String.valueOf(x));
        Double acc = 0.0;
        String y = String.valueOf(x);
        String[] numeros = y.split("");
        int expoente = numeros.length;
        List<Double> numb = new ArrayList<>();
        for (String numero: numeros) {
             numb.add(Double.parseDouble(numero));
        }
        for (Double numero: numb) {
            acc += Math.pow(numero, expoente);
        }
        if (acc.intValue() == x) {
            System.out.println("A premissa é verdadeira: ");
            System.out.println(acc);
        } else {
            System.out.println("A premissa é falsa");
        }




        sc.close();
    }
}

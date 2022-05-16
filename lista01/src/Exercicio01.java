import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.print("Entre com um numero inteiro entre 1 e 20: ");
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            x = sc.nextInt();
            sc.nextLine();
            if(x < 1 || x > 20)
                System.out.println("valor invalido, digite novamente");

        } while(x < 1 || x > 20);

        for ( int j = 0; j <= x; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("done");

        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com o valor de n1:");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com o valor de n2:");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com o valor de n3");
        int n3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual operação você deseja fazer? \n s -> soma \n p -> produto \n m -> média ");
        System.out.print("command: ");
        char c = sc.next().charAt(0);

        if ( c == 's' )
            soma(n1, n2, n3);
        else if (c == 'p') {
            produto(n1, n2, n3);
        } else if (c == 'm') {
            media( n1, n2, n3);
        }


        sc.close();
    }

    private static void media(int n1, int n2, int n3) {
        float m = (float) (n1 + n2 + n3) / 3;
        System.out.println(m);
    }

    private static void soma(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    public static void produto(int n1, int n2, int n3) {
        System.out.println(n1*n2*n3);
    }
}

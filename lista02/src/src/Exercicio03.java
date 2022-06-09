public class Exercicio03 {
    public static Boolean palindromo (String palavra) {
        String palindromo = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(palindromo);
    }

    public static void main(String[] args) {
        String test = "subinoonibus";
        boolean response = palindromo(test);
        System.out.println(response);
    }
}

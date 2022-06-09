import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio02 {

    public static StringBuilder shuffleString (String s1, String s2) {
        String concat = s1.concat(s2);
        List<String> letters = Arrays.asList(concat.split(""));
        Collections.shuffle(letters);
//        String acc = "";
        StringBuilder shuffleStr = new StringBuilder();
//        letters.forEach(acc::concat);
        letters.forEach(shuffleStr::append);
        return shuffleStr;
//        return acc;

    }
    public static void main(String[] args) {
        String s1 = "ABcD";
        String s2 = "DEFg";
        String finalStr = String.valueOf(shuffleString(s1, s2));
//        String finalStr = shuffleString(s1, s2);
        System.out.println(finalStr);

    }
}

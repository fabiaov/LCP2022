package exercicio01;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {

    public static String capitalize (String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        String test = "JOÃO CARLOS DA sILVA";
        String regex = "\\s+Da\\s+";
        Pattern padrao = Pattern.compile(regex);
        List<String> tokens = List.of(test.split(" "));
        StringBuilder str = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        for (String s : tokens) {
            str.append(capitalize(s)).append(" ");
        }
//        System.out.println(str);

        Matcher matcher = padrao.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(finalStr," da ");
        }
        matcher.appendTail(finalStr);

        System.out.println(finalStr);
//        \s+Da\s+
    }
}

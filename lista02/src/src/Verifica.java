import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verifica {

    public static void isValidRG(String rg) {
        String regex = "\\d{2}\\.\\d{3}\\.\\d{3}-(\\d{2}|X)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rg);
        boolean rgValidation = matcher.find();
        if (rgValidation) {
            System.out.println("O RG é Valido!");
            return;
        }
        System.out.println("O RG é Invalido!");
    }

    public static void main(String[] args) {
        String rgvalid = "88.659.721-X";
        String rgvalid2 = "88.659.721-45";
        String rginvalid = "8896374122";
        isValidRG(rgvalid); // para testar os RG's só passar o RG como argumento da isValidRG

    }
}

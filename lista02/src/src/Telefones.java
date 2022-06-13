import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Scanner;

public class Telefones {
    public static void whatKindPhone (String phone) throws ParseException {
        if ( phone.length() == 11 ){
            String ddd = phone.substring(0, 2);
            String phoneNumber = phone.substring(2);
            System.out.println("O DDD é: " + ddd);
            System.out.println("e o Telefone Celular é " + phoneNumber);
            MaskFormatter celFormat = new MaskFormatter("(##)#####-####");
            JFormattedTextField txtPhone = new JFormattedTextField(celFormat);
            txtPhone.setText(phone);
            System.out.println("numero formatado " + txtPhone.getText());
            return;
        }
        String ddd = phone.substring(0, 2);
        String phoneNumber = phone.substring(2);
        System.out.println("O DDD é: " + ddd);
        System.out.println("e o Telefone Residencial é " + phoneNumber);
        MaskFormatter telFormat = new MaskFormatter("(##)####-####");
        JFormattedTextField txtPhone = new JFormattedTextField(telFormat);
        txtPhone.setText(phone);
        System.out.println("numero formatado " + txtPhone.getText());

    }
    public static void main(String[] args) {

        /*Usei os numeros tel e cel para testar se o programa esta funcionando só substituindo
         na função whatKindPhone que fiz caso queira habilitar o usuario é só descomentar o
        * código abaixo do Scanner sc.
        * A entrada do usuario deve ser o ddd + numero sem o 0 antes do DDD.
        * converti para inteiro usando Integer.toString(number) */

        String cel = "19998547211";
        String tel = "1935548966";
        Scanner sc = new Scanner(System.in);
        /*int entrada = sc.nextInt()
        * String phoneNumber = Integer.toString(entrada) */

        try {
           whatKindPhone(tel);
            System.out.println("----------------------------------------");
            whatKindPhone(cel);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}

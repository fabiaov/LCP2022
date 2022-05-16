package Exercicio04;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Passaro;

public class ChamaAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Buddy", 2);
        Animal gato = new Gato("Felix", 7);
        Animal passaro = new Passaro("Karu", 1);

        System.out.println("Informações sobre os animais: ");
        System.out.println("Cachorro");
        System.out.println(cachorro);
        cachorro.talk();
        System.out.println("Gato");
        System.out.println(gato);
        gato.talk();
        System.out.println("Passaro");
        System.out.println(passaro);
        passaro.talk();
    }
}

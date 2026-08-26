package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        String nome = "Laís";
        String nome2 = "Laís";
        System.out.println(nome.equals(nome2));

        Smartphone smartphone01 = new Smartphone("A1B2C3", "Xiaomi");
        Smartphone smartphone02 = new Smartphone("A1B2C3", "Xiaomi");
        System.out.println(smartphone01.equals(smartphone02));
    }
}

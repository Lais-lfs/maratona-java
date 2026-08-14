package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Melissa  ";
        String numeros = "0123456789";
        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        System.out.println(nome.replace("a", "e"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(7));
        System.out.println(nome.trim());
    }
}

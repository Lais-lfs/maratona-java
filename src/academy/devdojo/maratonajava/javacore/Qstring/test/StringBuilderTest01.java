package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Laís Lara";
        nome = nome.concat(" Ferreira");
        System.out.println(nome);
        nome.substring(0,3);
        StringBuilder sb = new StringBuilder("Laís Lara");
        sb.append(" Ferreira").append(" dos").append(" Santos");
        sb.reverse();
        sb.reverse();
        sb.delete(7,9);
        System.out.println(sb);

    }
}

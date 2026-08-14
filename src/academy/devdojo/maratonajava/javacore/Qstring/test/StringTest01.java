package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Laís"; // String constant pool
        String nome2 = "Laís";
        nome = nome.concat(" Lara"); // é igual a: nome += " Lara";
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Laís"); // 1 variável de referência, 2 objeto do tipo String, 3 uma string no pool string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}

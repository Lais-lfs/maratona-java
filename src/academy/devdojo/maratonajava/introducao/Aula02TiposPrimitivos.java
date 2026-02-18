package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        // int, double, float, long, byte, boolean, char, short
        int idade = 9;
        int idadeCasting = (int) 10000000000L; //usou o casting para forçar esse número a ser do tipo int
        long numeroGrande = (long) 100000.56;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Laís";
        var nome2 = "Lara";

        System.out.println("a idade é: "+idade);
        System.out.println(idadeCasting);
        System.out.println(numeroGrande);
    }
}

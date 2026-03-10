package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores iniciais para cada tipo de variável
        // byte, short, int, long, float e double = 0
        // char '\u0000' = ' '
        // String = null
        // boolean = false

        String [] nomes = new String[3];

        nomes[0] = "Lara";
        nomes[1] = "Lucca";
        nomes[2] = "Lis";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }




    }
}

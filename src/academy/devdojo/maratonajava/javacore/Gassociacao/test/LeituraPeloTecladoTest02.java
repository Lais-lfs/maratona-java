package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraPeloTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao Software do Futuro!");
        System.out.println("Faça uma pergunta e responderei com 'SIM' ou 'NÃO'" +
                " ou digite 'P' para encerrar.");
        System.out.println("-------- *** --------");
        String pergunta = " ";

        while (pergunta.charAt(0) != 'P') {
            System.out.println("Digite sua pergunta:");
            pergunta = entrada.nextLine();

            if (pergunta.charAt(0) == ' ') {
                System.out.println("SIM");
            } else if (pergunta.charAt(0) == 'P') {
                break;
            } else {
                System.out.println("NÃO");
            }
        }
    }
}

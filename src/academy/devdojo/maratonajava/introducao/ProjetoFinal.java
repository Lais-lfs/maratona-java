package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        // Sistema de Gerenciamento de Notas Escolares
        // Crie uma classe `Aluno` com atributos (nome, notas). Use `Scanner` para entrada, `if/else` para aprovação e
        // um `ArrayList` para armazenar alunos.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos:");
        int quantidadeAlunos = leitura.nextInt();

        double[][] arrayAlunos = new double[quantidadeAlunos][3];

        for (int i = 0; i < quantidadeAlunos; i++) {
            for (int j = 0; j < arrayAlunos[i].length; j++) {
                System.out.println("Informe a " + (j + 1) + "º nota do aluno " + (i + 1) + ":");
                double nota = leitura.nextDouble();
                arrayAlunos[i][j] = nota;
            }
            System.out.println("-----------");
            System.out.println("Notas do(a) aluno(a) " + (i+1) + ":");
            System.out.println("Nota 01: " + arrayAlunos[i][0] +
                    "\nNota 02: " + arrayAlunos[i][1] +
                    "\nNota 03: " + arrayAlunos[i][2]);

            double media = (arrayAlunos[i][0] + arrayAlunos[i][1] + arrayAlunos[i][2]) / 3;
            System.out.println("Média das notas: " + media);

            if (media <= 4) {
                System.out.println("Aluno(a) " + (i + 1) + " foi reprovado.");
            } else if (media > 4 && media <= 6) {
                System.out.println("Aluno(a) " + (i + 1) + " está de recuperação.");
            } else if (media > 6 && media <= 10) {
                System.out.println("Aluno(a) " + (i + 1) + " foi aprovado.");
            }
            System.out.println("-----------");
        }
    }
}
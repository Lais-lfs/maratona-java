package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Seminario;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Lis dos Santos", 23);
        Seminario seminario01 = new Seminario("Extensão Universitária");

        aluno01.setSeminario(seminario01);

        aluno01.imprime();
    }
}

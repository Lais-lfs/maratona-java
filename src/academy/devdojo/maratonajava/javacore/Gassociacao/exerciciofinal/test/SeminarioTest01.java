package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local localSeminario01 = new Local("Rua Um, 63, Centro");
        Seminario seminario01 = new Seminario("Extensão Universitária", localSeminario01);

        Aluno aluno01 = new Aluno("Lis dos Santos", 23);
        Aluno aluno02 = new Aluno("Luis Amaral", 20);
        Aluno aluno03 = new Aluno("Lisa Ferreira", 21);

        Aluno [] alunos = {aluno01, aluno02, aluno03};

        seminario01.setAluno(alunos);

        seminario01.imprime();
    }
}

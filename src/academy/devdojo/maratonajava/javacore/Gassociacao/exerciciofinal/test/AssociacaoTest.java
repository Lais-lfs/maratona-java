package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local localSeminario01 = new Local("Rua Um, 63, Centro");

        Seminario seminario01 = new Seminario("Extensão Universitária", localSeminario01);
        Seminario seminario02 = new Seminario("Tudo sobre Desenvolvimento em JAVA", localSeminario01);
        Seminario seminario03 = new Seminario("Desbravando o Back-end", localSeminario01);


        Aluno aluno01 = new Aluno("Lis dos Santos", 23);
        Aluno aluno02 = new Aluno("Luis Amaral", 20);
        Aluno aluno03 = new Aluno("Lisa Ferreira", 21);

        aluno01.setSeminario(seminario01);
        aluno02.setSeminario(seminario01);
        aluno03.setSeminario(seminario01);

        Aluno [] alunos = {aluno01, aluno02, aluno03};
        seminario01.setAluno(alunos);

        Professor professor01 = new Professor("André Felício", "Doutor em Sistemas de Informação");

        Seminario [] seminarios = {seminario01, seminario02, seminario03};

        professor01.setSeminarios(seminarios);

        professor01.imprime2();
    }
}

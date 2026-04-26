package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio.Seminario;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("André Felício", "Doutor em Sistemas de Informação");

        Seminario seminario01 = new Seminario("Extensão Universitária");
        Seminario seminario02 = new Seminario("Tudo sobre Desenvolvimento em JAVA");
        Seminario seminario03 = new Seminario("Desbravando o Back-end");

        Seminario [] seminarios = {seminario01, seminario02, seminario03};

        professor01.setSeminarios(seminarios);

        professor01.imprime();
    }
}

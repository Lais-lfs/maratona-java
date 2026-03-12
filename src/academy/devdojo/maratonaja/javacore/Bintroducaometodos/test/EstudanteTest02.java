package academy.devdojo.maratonaja.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonaja.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonaja.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Lindomar";
        estudante01.idade = 52;
        estudante01.sexo = 'M';

        estudante02.nome = "Jubiscleusa";
        estudante02.idade = 45;
        estudante02.sexo = 'F';

        estudante01.imprime();

        estudante02.imprime();
    }
}

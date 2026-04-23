package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Lis dos Santos");
        Professor professor02 = new Professor("Luis Ferreira");
        Professor [] professores = {professor01, professor02};

        Escola escola = new Escola("EE AMES", professores);

        escola.imprime();
    }
}

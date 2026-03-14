package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Lulu Melissa";
        professor.idade = 35;
        professor.sexo = 'F';

        System.out.println("Nome professor: " + professor.nome + "\nIdade: " +
                professor.idade + "\nSexo: " + professor.sexo);
    }
}

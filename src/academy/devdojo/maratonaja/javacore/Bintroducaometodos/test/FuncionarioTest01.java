package academy.devdojo.maratonaja.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonaja.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Exercício:
        // Crie uma classe funcionário com os seguintes atributos:
        // - nome, idade, salário (três salários devem ser guardados)
        //
        // Crie dois métodos:
        // 1. Para imprimir os dados
        // 2. Para tirar a média dos salários e imprimir o resultado

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marilice");
        funcionario.setIdade(39);
        funcionario.setSalarios(new double [] {2500, 2600, 3500});

        funcionario.imprimeFuncionario();
    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Gerente;

public class HerancaTest01 {
    public static void main (String[] args) {
        Funcionario funcionario = new Funcionario("Lara", 15000);
        Gerente gerente = new Gerente("Laís", 20000, "Admin");

        System.out.println("---------");
        gerente.exibirDados();

        double bonus = gerente.calcularBonus(gerente.getSalario());
        System.out.println("Salário com bônus de 10%: " + bonus);

        System.out.println("---------");
        funcionario.exibirDados();

        double bonusFuncionario = funcionario.calcularBonus(funcionario.getSalario());
        System.out.println("Valor do bônus de 10% sobre salário: " + bonusFuncionario);
    }
}

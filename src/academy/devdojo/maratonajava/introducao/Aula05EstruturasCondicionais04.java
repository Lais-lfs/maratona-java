package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main (String[] args) {
        // Exercício: quanto devo pagar de imposto na Holanda, baseado em meu salário anual.

        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double imposto;

        if (salarioAnual > 0 && salarioAnual <= 34712) {
            imposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual * segundaFaixa;
        } else {
            imposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O valor do imposto é de: "+imposto);
    }
}

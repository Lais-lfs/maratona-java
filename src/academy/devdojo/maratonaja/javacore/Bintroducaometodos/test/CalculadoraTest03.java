package academy.devdojo.maratonaja.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonaja.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);

        // Como ela é void, faz a chamada direto
       calculadora.divideDoisNumeros02(20,0);

    }
}

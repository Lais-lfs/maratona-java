package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main (String[] args) {
        Carro carro01 = new Carro("Porsche", 2023);
        carro01.imprime();

        Carro.setVelocidadeMaxima(290);
        carro01.imprime();
    }
}

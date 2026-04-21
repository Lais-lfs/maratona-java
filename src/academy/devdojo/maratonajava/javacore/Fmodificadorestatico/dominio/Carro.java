package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String marca;
    private int ano;
    private static int velocidadeMaxima = 250;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public static void setVelocidadeMaxima(int velocidadeMaxima) {
        Carro.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("----------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Máxima: " + Carro.velocidadeMaxima);
    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Eletrico;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Moto;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Veiculo;

public class HerancaTest02 {
    public static void main (String [] args) {
        Veiculo veiculo = new Veiculo("Ford", "Fiesta", 2009);
        Eletrico eletrico = new Eletrico("BYD", "Dolphin Mini", 2025, 10);
        Moto moto = new Moto("Honda", "Bros", 2026, "Flex", 160);

        System.out.println("------------");
        veiculo.exibirInformacoes();
        veiculo.acelerar(80);
        veiculo.frear(10);
        veiculo.frear(60);
        veiculo.frear(20);

        System.out.println("------------");
        eletrico.exibirInformacoes();
        eletrico.acelerar(80);
        eletrico.acelerar(20);
        eletrico.frear(50);
        eletrico.recarregarBateria();
        eletrico.exibirInformacoes();

        System.out.println("------------");
        moto.exibirInformacoes();
        moto.acelerar(100);
        moto.frear(50);
    }
}

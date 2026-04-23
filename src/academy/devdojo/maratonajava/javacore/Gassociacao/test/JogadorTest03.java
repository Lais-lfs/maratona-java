package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main (String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Neymar");
        Jogador [] jogadores = {jogador01, jogador02};

        Time time = new Time("Brasil");

        jogador01.setTime(time);
        jogador02.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");
        jogador01.imprime();
        jogador02.imprime();

        System.out.println("--- Time ---");
        time.imprime();


    }
}

package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

import java.sql.Array;

public class JogadorTest01 {
    public static void main (String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador [] jogadores = {jogador01, jogador02, jogador03};

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }

        //Outra forma de usar o "for"
//        for (Jogador jogador : jogadores) {
//            jogador.imprime();
//        }

    }
}

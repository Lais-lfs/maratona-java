package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        // anime.init("Fullmetal Alchimist", "TV", 250);
        anime.init("Fullmetal Alchimist", "TV", 250, "Aventura");
        anime.imprime();
    }
}

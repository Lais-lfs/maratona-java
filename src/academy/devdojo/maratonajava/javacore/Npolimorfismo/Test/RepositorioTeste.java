package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        // Outro exemplo de interface:
        List<String> list = new ArrayList<>();
        list.add("Porsche");
        list.add("Audi");
        list.add("Fiat");
        list.add("Volvo");
        System.out.println(list);


    }
}

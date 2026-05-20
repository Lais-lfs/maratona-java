package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento.DEBITO;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_FISICA;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Jonas", PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("JonasLTDA", TipoCliente.PESSOA_JURIDICA, DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

        System.out.println(DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA"); //Busca pelo nome do atributo
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física"); //Busca pelo valor do atributo
        System.out.println(tipoCliente2);

        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física951"); //Busca pelo valor do atributo
        System.out.println(tipoCliente3);
    }
}

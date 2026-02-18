package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/*
Prática:
Crie variáveis para que os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args) {
        String nome = "Laís Lara F.";
        String endereco = "Rua Um, nº 247, bairro Pouso Alegre";
        double salario = 2549.57;
        String dataRecebimentoSalario = "17/02/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+" confirmo " +
                "que recebi o salário de R$ "+salario+" na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}

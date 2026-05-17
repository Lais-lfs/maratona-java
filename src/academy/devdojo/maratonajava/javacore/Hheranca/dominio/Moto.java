package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String combustivel, int cilindradas) {
        super(marca, modelo, ano, combustivel);
        this.cilindradas = cilindradas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}

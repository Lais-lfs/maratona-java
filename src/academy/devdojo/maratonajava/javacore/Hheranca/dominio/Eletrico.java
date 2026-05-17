package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Eletrico extends Veiculo {
    private double bateria;

    public Eletrico(String marca, String modelo, int ano, double bateria) {
        super(marca, modelo, ano);
        this.bateria = bateria;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nível de bateria: " + bateria);
    }

    public void acelerar(double valor) {
        if (bateria > 0) {
            super.acelerar(valor);
            bateria -= 10;
            System.out.println("Nível de bateria: " + bateria + "\n      *******     ");
        } else {
            System.out.println("Recarregue a bateria para realizar esta ação.");
        }
    }

    public void frear(double valor) {
        if (bateria != 0) {
            super.frear(valor);
        } else {
            velocidade = 0;
            super.frear(velocidade);
        }
    }

    public double recarregarBateria() {
        return bateria = 100;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }
}

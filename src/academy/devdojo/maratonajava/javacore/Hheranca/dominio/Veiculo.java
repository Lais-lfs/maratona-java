package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String combustivel;
    protected double velocidade = 0;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo(String marca, String modelo, int ano, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        if (combustivel != null) {
            System.out.println("Tipo de Combustível: " + combustivel);
        }
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void acelerar(double valor) {
        velocidade += valor;
        System.out.println("Acelerando... Velocidade: " + velocidade + " km/h");
    }

    public void frear(double valor) {
        if (velocidade - valor >= 0) {
            velocidade -= valor;
            System.out.println("Freando... Velocidade: " + velocidade + " km/h");
        } else {
            velocidade = 0;
            System.out.println("Freando... Velocidade: " + velocidade + " km/h");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

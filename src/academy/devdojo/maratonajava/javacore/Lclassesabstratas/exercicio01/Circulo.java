package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Círculo: " +
                "raio = " + raio +
                ", cor='" + cor + '\'';
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(raio, 2);
        //area = Math.PI * (raio * raio);
        System.out.println("Área do círculo de raio de " + this.raio + "m: " +
                String.format("%.2f", area) + "m²");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

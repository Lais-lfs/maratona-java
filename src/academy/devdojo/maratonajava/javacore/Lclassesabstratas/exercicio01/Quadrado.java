package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado: " +
                "lado = " + lado +
                ", cor = '" + cor + '\'';
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(lado, 2);
        System.out.println("Área do quadrado de lado de " + this.lado + "m: " + this.area + "m²");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

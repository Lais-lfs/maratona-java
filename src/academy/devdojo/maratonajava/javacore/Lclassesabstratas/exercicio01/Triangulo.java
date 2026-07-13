package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triângulo: " +
                "base = " + base +
                ", altura = " + altura +
                ", cor = '" + cor + '\'';
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
        System.out.println("Área do triângulo de base de " + this.base + "m e altura de " +
                this.altura + "m é de: "
                + this.area + "m²");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

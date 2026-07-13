package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public abstract class FormaGeometrica {
    protected String cor;
    protected double area;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "cor='" + cor + '\'' +
                ", area=" + area +
                '}';
    }

    public abstract void calcularArea();
}

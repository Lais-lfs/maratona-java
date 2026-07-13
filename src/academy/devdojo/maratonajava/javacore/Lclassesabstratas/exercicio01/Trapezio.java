package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public class Trapezio extends FormaGeometrica {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(String cor, double baseMaior, double baseMenor, double altura) {
        super(cor);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Trapézio: " +
                "baseMaior = " + baseMaior +
                ", baseMenor = " + baseMenor +
                ", altura = " + altura +
                ", cor='" + cor + '\'';
    }

    @Override
    public void calcularArea() {
        area = ((baseMaior + baseMenor) * altura ) / 2;
        System.out.println("Área do trapézio de base maior de " + this.baseMaior + "m, base menor de " +
                this.baseMenor + "m e de altura de " + this.altura + " é de: "
                + this.area + "m²");
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

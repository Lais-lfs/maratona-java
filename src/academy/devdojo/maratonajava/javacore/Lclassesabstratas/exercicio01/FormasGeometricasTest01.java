package academy.devdojo.maratonajava.javacore.Lclassesabstratas.exercicio01;

public class FormasGeometricasTest01 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Azul", 3);
        System.out.println(quadrado);
        quadrado.calcularArea();

        System.out.println("----------- *** -----------");
        Retangulo retangulo = new Retangulo("Verde", 4, 6);
        System.out.println(retangulo);
        retangulo.calcularArea();

        System.out.println("----------- *** -----------");
        Triangulo triangulo = new Triangulo("Amarelo", 5, 8);
        System.out.println(triangulo);
        triangulo.calcularArea();

        System.out.println("----------- *** -----------");
        Trapezio trapezio = new Trapezio("Lilás", 10, 8, 12);
        System.out.println(trapezio);
        trapezio.calcularArea();

        System.out.println("----------- *** -----------");
        Circulo circulo = new Circulo("Vermelho", 2);
        System.out.println(circulo);
        circulo.calcularArea();

        System.out.println("----------- *** -----------");
        retangulo.setAltura(9);
        retangulo.calcularArea();
    }
}

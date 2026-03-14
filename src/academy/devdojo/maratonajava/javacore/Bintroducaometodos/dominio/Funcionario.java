package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios != null) {
            for (int i = 0; i < this.salarios.length; i++) {
                System.out.print(this.salarios[i] + " ");
            }
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
        }

        for (int i = 0; i < salarios.length; i++) {
            media += salarios[i];
        }
//        for (double salario : salarios) {
//            media += salario;
//        }
        media /= salarios.length;

        System.out.printf("\nMédia dos três salários: %.2f", media);
        //System.out.printf("MEDIA = %.5f", media    );
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: " + this.setor);
    }

    // @Override -> poderia usar aqui
    public double calcularBonus(double salario) {
        return salario + super.calcularBonus(salario);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}

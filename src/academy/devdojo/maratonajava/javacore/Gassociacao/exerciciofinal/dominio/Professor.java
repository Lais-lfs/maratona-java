package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println("Seminário: " + seminario.getTitulo());
            }
        }
    }

    public void imprime2() {
        System.out.println("------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (this.seminarios == null) return;

        System.out.println("\n------------");
        System.out.println("## Seminários Cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println("\nSeminário: " + seminario.getTitulo() + " / " + "Endereço: " + seminario.getLocal().getEndereco());

            if (seminario.getAluno() == null || seminario.getAluno().length == 0) {
                System.out.println("Ainda não há alunos inscritos");
            } else {
                System.out.println("\n** Alunos **");

                for (Aluno aluno : seminario.getAluno()) {
                    System.out.println("Nome: " + aluno.getNome() + ", " + "Idade: " + aluno.getIdade());
                }
            }
        }
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

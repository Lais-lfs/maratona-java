package academy.devdojo.maratonajava.javacore.Gassociacao.exerciciofinal.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Nome do Seminário: " + this.titulo);
        System.out.println("Endereço: " + local.getEndereco());

        if (alunos != null) {
            System.out.println("Alunos inscritos no seminário:");
            for (Aluno aluno : alunos) {
                System.out.println("Aluno(a): " + aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno inscrito no seminário.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }
}

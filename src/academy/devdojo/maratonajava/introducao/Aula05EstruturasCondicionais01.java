package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebída alcólica.");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        //aqui o "=" atribui um valor, não compara ele.
        boolean teste = false;
        if (teste = true) {
            System.out.println("Entrou no if.");
        }
    }
}

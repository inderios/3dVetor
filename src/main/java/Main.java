import VetorialOperacoes.ProdutoVetorial;
import VetorialOperacoes.Vetorial;
import entities.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor01 = new Vetor(-1,2,5);
        Vetor vetor02 = new Vetor(-3,5,6);
        Vetorial fazBagulho = new Vetorial();

        Vetor novoVetor = fazBagulho.produtoVetorial(vetor01, vetor02);
        System.out.println(
                novoVetor.toString()
        );
        System.out.println(
                fazBagulho.modulo(novoVetor)
        );
    }
}

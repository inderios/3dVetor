package VetorialOperacoes;

import entities.Vetor;

import static java.lang.Math.sqrt;

public class Vetorial {
    public Vetor produtoVetorial(Vetor vectA, Vetor vectB) {
        Vetor produto = new Vetor();
        ProdutoVetorial geraProduto = new ProdutoVetorial();

        try {
            produto = geraProduto.gerarProduto(vectA, vectB);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return produto;
    }
    public double modulo(Vetor vetor) {
        return sqrt(Math.pow(vetor.x(),2) +
                Math.pow(vetor.y(),2) +
                Math.pow(vetor.z(),2));
    }
}

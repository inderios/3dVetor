package VetorialOperacoes;

import entities.Vetor;

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
}

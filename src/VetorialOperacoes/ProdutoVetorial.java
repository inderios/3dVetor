package VetorialOperacoes;

import entities.Vetor;

public class ProdutoVetorial {

    public Vetor gerarProduto(Vetor v, Vetor v1) {
        diagonalPrincipal diagonalPrincipal = new diagonalPrincipal();
        diagonalSecundaria diagonalSecundaria = new diagonalSecundaria();

        float[] diagPrincipal = diagonalPrincipal.diagPrincipal(v, v1);
        float[] diagSecundaria = diagonalSecundaria.diagSecundaria(v, v1);

        float pontoX, pontoY, pontoZ;

        pontoX = (diagPrincipal[0] - diagSecundaria[0]);
        pontoY = (diagPrincipal[1] - diagSecundaria[1]);
        pontoZ = (diagPrincipal[2] - diagSecundaria[2]);

        return new Vetor(pontoX, pontoY, pontoZ);
    }
}

package VetorialOperacoes;

import entities.Vetor;

public class diagonalPrincipal {

    public float[] diagPrincipal(Vetor u, Vetor w) {
        float i, j, k;

        i = u.y() * w.z();
        j = u.z() * w.x();
        k = u.x() * w.y();

        return new float[]{i, j, k};
    }
}

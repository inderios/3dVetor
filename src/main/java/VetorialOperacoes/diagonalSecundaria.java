package VetorialOperacoes;

import entities.Vetor;

public class diagonalSecundaria {
    public float[] diagSecundaria(Vetor u, Vetor w) {
        float i, j, k;

        i = u.z() * w.y();
        j = u.x() * w.z();
        k = u.y() * w.x();

        return new float[]{i, j, k};
    }
}

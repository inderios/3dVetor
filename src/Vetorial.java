public class Vetorial {
 private record Vetor(float x, float y, float z) {
 };
 Vetor vetorA = new Vetor(-1, 2, 4);
 Vetor vetorB = new Vetor(1, 3, 5);
    public Vetor produtoVetorial(Vetor a, Vetor b) {
        Vetor vetorA = new Vetor(-1, 2, 4);
        Vetor vetorB = new Vetor(1, 3, 5);
        Vetor novoVetor = null;
        try {
            novoVetor = geraMatrixes(vetorA, vetorB);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return novoVetor;
    }

    private Vetor geraMatrixes(Vetor u, Vetor w) {
        float[] diagonalPrincipalList = diagonalPrincipal(u, w);
        float[] diagonalSecundariaList = diagonalSecundaria(u, w);
        int i =0;
        float x, y, z;
        x = (diagonalPrincipalList[0] - diagonalSecundariaList[0]);
        y = (diagonalPrincipalList[1] - diagonalSecundariaList[1]);
        z = (diagonalPrincipalList[2] - diagonalSecundariaList[2]);
        Vetor novoVetor = new Vetor(x,y,z);
        return novoVetor;
    }

    private float[] diagonalSecundaria(Vetor u, Vetor w) {
        float i = 1, j = 1, k = 1;

        i = i * u.z() * w.y();
        j = j * u.x() * w.z();
        k = k * u.y() * w.x();
        float[] diagonalSecundaria = new float[] {i, j, k};
        return diagonalSecundaria;

    }
    private float[] diagonalPrincipal(Vetor u, Vetor w) {
        float i = 1, j = 1, k = 1;

        i = i * u.y() * w.z();
        j = j * u.z() * w.x();
        k = k * u.x() * w.y();
        float[] diagonalPrincipal = new float[] {i, j, k};
        return diagonalPrincipal;
    }
}

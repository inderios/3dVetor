public class Main {
    public static void main(String[] args) {
        Vetorial unoObjeto = new Vetorial();
        Vetorial.Vetor vetorA = new Vetorial.Vetor(-1, 2, 4);
        Vetorial.Vetor vetorB = new Vetorial.Vetor(1, 3, 5);
        System.out.println(unoObjeto.produtoVetorial(vetorA, vetorB).toString());
    }
}
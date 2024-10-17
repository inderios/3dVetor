import VetorialOperacoes.Vetorial;
import entities.Vetor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vetorial vetorial = new Vetorial();


        Vetor v = new Vetor(1, 2, 3);
        Vetor w = new Vetor(4, 5, 6);

        System.out.println(vetorial.produtoVetorial(v, w));
    }
}
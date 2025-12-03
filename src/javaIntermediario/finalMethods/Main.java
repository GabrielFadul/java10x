package javaIntermediario.finalMethods;

import javaIntermediario.abstracao.Uzumaki;

public class Main {
    static void main() {
        Uzumaki naruto = new Uzumaki("Naruto");

        // A classe Uzumaki tentou sobrescrever
        naruto.tacarKunai();
        System.out.println(naruto.altura);
    }
}

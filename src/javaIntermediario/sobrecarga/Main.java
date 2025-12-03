package javaIntermediario.sobrecarga;

import javaIntermediario.abstracao.NivelNinja;
import javaIntermediario.abstracao.Uchiha;

public class Main {
    static void main() {
        Uchiha madara = new Uchiha(
                "Marara",
                45,
                "Aldeia da Folha",
                900,
                NivelNinja.KAGE
        );

        System.out.println(madara);
    }
}

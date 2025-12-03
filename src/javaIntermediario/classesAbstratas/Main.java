package javaIntermediario.classesAbstratas;

public class Main {
    static void main() {
        Senju tobirama = new Senju(
                "Tobirama",
                49,
                false
        );

        tobirama.mostrarInformacoes();
        tobirama.obterSabedoriaHokage();
    }
}


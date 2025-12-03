package javaIntermediario.multiplaHerancas;

public class Main {
    static void main() {
        String aldeiaDaFolha = "Aldeia da folha";

        Uchiha sasuke = new Uchiha(
                "Saruke",
                18,
                aldeiaDaFolha
        );

        Hatake kakashi = new Hatake(
                "Kakashi",
                27,
                aldeiaDaFolha
        );

        sasuke.mostrarInformacoes();
        sasuke.sharinganAtivado();

        System.out.println("----------");

        kakashi.mostrarInformacoes();
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.bemVindoAAmbu();
    }
}

package javaIntermediario.getterAndSetters;

public class Main {
    static void main() {
        Uchiha sasuke = new Uchiha(
                "Sasuke",
                18,
                97
        );

        System.out.println(sasuke);
        System.out.println(sasuke.getNome());

        Uchiha itachi = sasuke;
        itachi.setNome("Itachi");
        itachi.setIdade(27);
        itachi.setMissoesConcluidas(546);

        System.out.println(itachi);
        System.out.println(itachi.getNome());
    }
}


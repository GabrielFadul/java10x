package javaIntermediario.abstracao;

public class Main {
    static void main() {
        Uzumaki naruto = new Uzumaki("Naruto");
        Uchiha sasuke = new Uchiha("Sakuke");

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.estrategiaDeCombate();

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.estrategiaDeCombate();
    }
}

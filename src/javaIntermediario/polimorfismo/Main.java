package javaIntermediario.polimorfismo;

import javaIntermediario.heranca.Ninja;

public class Main {
    static void main() {
        Ninja sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.ativarHabilidadeEspecial();
    }
}

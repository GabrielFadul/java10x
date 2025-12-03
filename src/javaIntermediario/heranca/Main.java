package javaIntermediario.heranca;


import javaIntermediario.polimorfismo.Uchiha;

public class Main {
    static void main() {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;

        sakura.curar(sasuke);
    }
}

package javaIntermediario.interfaces;

import javaIntermediario.construtores.Uzumaki;

public class Boruto extends Uzumaki implements HyugaUzumaki{
    @Override
    public void AtivarKarma() {
        System.out.println("O Karma ativou");
    }

    @Override
    public void AtivarJogan() {
        System.out.println("O Jogan ativou");
    }
}

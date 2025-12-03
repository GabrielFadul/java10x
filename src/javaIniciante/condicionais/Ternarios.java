package javaIniciante.condicionais;

public class Ternarios {
    static void main() {
        /*
         * Ternarios: São maneiras de reduzir o codigo
         * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
         */

        short numMissoes = 1;
        String nivelDoNinja = (numMissoes >= 10) ? "Esse ninja está com mais de 10" : "Esse ninja tem menos que 10";
        System.out.println(nivelDoNinja);

    }
}

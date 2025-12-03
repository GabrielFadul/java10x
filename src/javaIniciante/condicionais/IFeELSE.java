package javaIniciante.condicionais;

public class IFeELSE {
    static void main() {

        /*
         * IF e ELSE - Condições
         * else if
         * Objetivo: Passar o ninja de nível de acordo com o número de missões
         **/

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;


        /*
         * if (condicao) {resultado}
         * else if (condicao) {resultado}
         * else {resultado caso nada seja verdadeiro}
         **/

        if(numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }




    }
}

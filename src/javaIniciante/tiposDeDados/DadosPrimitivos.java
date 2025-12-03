package javaIniciante.tiposDeDados;

public class DadosPrimitivos {
    static void main() {
        /**
         *  Dados primitivos: int, double, float, char, boolean, byte, short
         *  Objetivo da aula: Criar um ninja - Naruto -
         */

        int idade = 17; // valor máximo: 2147483647
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        long saldoBancario = 20137383647L; // Valor Maximo: 9,223,372,036,854,775,807


        System.out.println(idade); // Comando para mostrar no console
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo bancário é: " + saldoBancario); // podendo concatenar com outra String ou variavel
        System.out.println("Idade no ninja é: " + idade);

    }
}

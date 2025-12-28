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



        boolean trueOrFalse = true; // false
        byte _8bits = 127; // 255, dividido entre negativo e positivo
        short _16bits = 32767;
        int _32bits = 2147483647;
        long _64bits = 9223372036854775807L; // Número maior (Usa L no final)
        float decimal_32bits = 2.9999999f; // precisão simples (Usa f no final)
        double decimal_64bits = 2.000000000000000; // precisão complexa
        char char_16bits = 'A'; // Unicode ou ASCII



    }
}

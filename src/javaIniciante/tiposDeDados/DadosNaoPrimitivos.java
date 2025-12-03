package javaIniciante.tiposDeDados;

public class DadosNaoPrimitivos {
    static void main() {
        // Tudo o que for digitado dentro do PSVM vai ser compilado pelo java

        /*
         * Dados não primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja, e atribuir métodos a ele
         */

        // Declarando a variavel como Naruto Uzumaki
        String nome = "naruto uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // O metodo retorna o nome em CAPSLOCK, então é necessário coloca-lo em outra variavel
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // O metodo retorna o nome em minusculo
        System.out.println(aldeiaEmCaixaBaixa);


    }
}

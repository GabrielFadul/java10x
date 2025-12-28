package javaIniciante.condicionais;

import java.util.Scanner;

public class LacosRepeticao {
    static void main() {
        /*
         * Laços de Repeticao: Vão repetir infinitamente ou até atingir o parametro desejado
         *  WHILE, FOR, DO-WHILE
         */

        //While
        //while(condicao) {tudo aqui vai acontecer)

        Scanner sc = new Scanner(System.in);

        int numeroDeClones = 0;
        int numMaximoDeClones = 40;

        while(numeroDeClones < numMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        //FOR
        for(int i = 1; i <= numMaximoDeClones; i++){
            System.out.println("O naruto esta se clonando e ja se clonou " + i);
        }


        int numero;
        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            System.out.println("Você digitou: " + numero);

        } while (numero != 0);

        int[] numeros = {10, 20, 30, 40, 50};

        // for-each (for aprimorado)
        for (int n : numeros) {
            System.out.println(n);
        }

    }

}

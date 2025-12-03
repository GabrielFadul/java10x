package javaIniciante.condicionais;

public class LacosRepeticao {
    static void main() {
        /*
         * Laços de Repeticao: Vão repetir infinitamente ou até atingir o parametro desejado
         *  WHILE, FOR, DO-WHILE
         */

        //While
        //while(condicao) {tudo aqui vai acontecer)

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


    }
}

package javaIniciante.condicionais;

import java.util.Scanner;

public class EstudoSwitchCase {
    static void main() {

        /*
         * SwitchCases: Servem para tratar casos especificos
         * Objetivo: pedir para o usuario escolher entre os Ninjas
         * switchCase
         */

        //Pedir para o usuário
        Scanner sc = new Scanner(System.in);

        //Mostrar Opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Lê o input do usuário
        int escolha = sc.nextInt();

        //Usando o motivador escolha, veremos o caso que o usuário escolheu
        switch(escolha){
            case 1:
                System.out.println("O próximo Hokage");
                break;
            case 2:
                System.out.println("O ninja mais revoltado");
                break;
            case 3:
                System.out.println("Personagem mais inutil");
                break;
            default:
                System.out.println("Digitou um numero inválido");
        }

        //Fechar o Scanner
        sc.close();

    }
}

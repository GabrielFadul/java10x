package javaIniciante.condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {
    static void main() {

        /*
         * Scanner = É um jeito de trazer dados do usuário para a aplicação
         * Objetivo: Usuario criar um Ninja e vamos validar os dados
         **/

        //Abrir um Scanner
        Scanner sc = new Scanner(System.in);

        //Recebe o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeNinja = sc.nextLine();
        System.out.println("O nome do ninja é: " + nomeNinja);

        //Recebe a idade do ninja
        System.out.println("Escreva aqui a idade do ninja: ");
        int idadeNinja = sc.nextInt();
        System.out.println("A idade do ninja é: " + idadeNinja);

         //Tratamento de dados
        if(idadeNinja >= 18) {
            System.out.println("Esse ninja é de maior e pode ir em missoes fora da aldeia");
        } else {
            System.out.println("Esse ninja é de menor e não pode sair da aldeia");
        }

        //Fechar Scanner
        sc.close();

    }
}

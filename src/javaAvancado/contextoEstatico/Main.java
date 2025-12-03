package javaAvancado.contextoEstatico;

public class Main {

    /*
    * Variaveis globais fora do metodo Main, Cria constantes globais, compartilham estados
    **/
    static int idade = 17;
    int tentativas;

    static void main() {

        /* O campo estatico permite que voce use metodos, variaveis, classes
        * sem precisar INSTANCIAR um OBJETO.
        *
        *  Por exemplo: A variavel idade esta fora do campo static, mas por ser static faz parte
        * */
        System.out.println(idade);


        // Usando metodos NAO ESTATICOS
        Ninja ninja = new Ninja();
        ninja.hello(); // Preciso instanciar o Objeto para acessar

        // Usando metodos ESTATICOS
        Ninja.helloStatic(); // Nao precisa, ja chama direto da Classe

        // Metodos NAO ESTATICOS da mesma CLASSE
        Main main = new Main(); // Preciso instanciar a classe
        main.metodoNEstatico();

        // Metodos ESTATICOS da mesma CLASSE
        metodoEstatico();


    }
    public void metodoNEstatico(){
        System.out.println("N sou um metodo estatico");
    }

    public static void metodoEstatico(){
        System.out.println("Eu sou um metodo estatico");
    }
}

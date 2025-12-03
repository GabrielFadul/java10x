package javaIntermediario.classesAbstratas;

// Não pode ser criada sem ser herdada antes
public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    Hokages() {}

    Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }



    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Está vivo: " + (vivoOuNao ? "Sim" : "Não"));
    }

    public abstract void obterSabedoriaHokage();
}

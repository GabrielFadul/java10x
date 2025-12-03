package javaIntermediario.desafio6;

public record Ninja(String nome, int idade, String vila) {
    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nVila: " + vila;
    }
}

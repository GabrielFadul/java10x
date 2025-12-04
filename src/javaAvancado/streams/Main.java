package javaAvancado.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto", "folha", 17));
        ninjas.add(new Ninja("Sasuke", "folha", 60));
        ninjas.add(new Ninja("Sakura", "folha", 17));
        ninjas.add(new Ninja("Temari", "areia", 10));
        ninjas.add(new Ninja("Gaara", "areia", 18));
        ninjas.add(new Ninja("Kankuro", "areia", 48));
        ninjas.add(new Ninja("Kakashi", "folha", 30));

        // Filtragem dos ninjas por vila
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("folha")) //filtra o ninja, se tiver vila igual folha
                .forEach(System.out::println); //soutc

        System.out.println("=========================================================");
        // Ordenacao
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println); // Ordena por cordenacao

        System.out.println("=========================================================");
        // Ordenacao por nomes
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println); // Ordena por cordenacao

        System.out.println("=========================================================");
        //map - Mapeia A CLASSE por um atributo
        ninjas.stream()
                .map(Ninja::getNome) // mapeia por NOME
                .forEach(System.out::println);

        System.out.println("=========================================================");
        //max - Filtrar por ninja mais velho. O MAXIMO de idade
            Ninja ninjaMaisVelho = ninjas.stream()
                                            .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                                            .orElse(null);

        System.out.println("O ninja mais velho eh: " + ninjaMaisVelho);

    }

}

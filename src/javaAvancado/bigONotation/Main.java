package javaAvancado.bigONotation;


import java.util.ArrayList;

public class Main {
    static void main() {
        // Tudo sao algoritmos

        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto", 17));
        ninjas.add(new Ninjas("Sasuke", 17));
        ninjas.add(new Ninjas("Sakura", 17));

        // Algoritmo - 0(1) Complexidade Constante. Nao importa o tamanho, ele so acha o index
        System.out.println(ninjas.get(2));

        // Algoritmo - O(n) Complexidade Linear. O tamanho importa, percorrer a lista.
        for (Ninjas ninja : ninjas ){
            System.out.println(ninja);
        }


        // Algoritmo - O(n2) Complexidade Quadratica. O tamanho importa, percorrer a lista duas vezes
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size() ; j++) {
                System.out.println(ninjas.get(i) + " Contra " + ninjas.get(j));
            }
        }






    }
}

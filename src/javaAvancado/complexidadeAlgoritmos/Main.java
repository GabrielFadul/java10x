package javaAvancado.complexidadeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static void main() {

        long inicio;
        long  fim;
        long tempo;


        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> lkl = new LinkedList<>();

        // O(n) pois sempre passa 1 por 1 entao crescer linear dependendo de todos. Nested For eh O(n2) por ter duas vezes
        for (int i = 0; i < 10000000 ; i++) {
            al.add(i);
            lkl.add(i);
        }

        inicio = System.nanoTime(); // inicio da operacao
        // Verificar o numero no index arrayList
        al.add(45667);

        fim = System.nanoTime(); // final da operacao
        tempo = fim - inicio;// conta do tempo
        System.out.println("Tempo do ArrayList: " + tempo + " ns");

        inicio = System.nanoTime(); // inicio da operacao
        // Verificar o numero no index LinkedList
        lkl.add(45667);

        fim = System.nanoTime(); // final da operacao
        tempo = fim - inicio; // conta do tempo
        System.out.println("Tempo do LinkedList: " + tempo + " ns");

    }
}

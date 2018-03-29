package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.*;

/**
 * Classe principal
 *
 * @author gabrieldutra
 */
public class Principal {

    private static List<Item> criaListaOrdenada(int inicio, int quantidade) {
        ArrayList<Item> lista = new ArrayList<>();
        for (int i = inicio; i < inicio + quantidade; i++) {
            lista.add(new Item(i));
        }
        return lista;
    }

    private static void insereElementosOrdenados(List<Item> lista, ArvoreBinaria arvore) {
        for (Item i : lista) {
            arvore.insere(i);
        }
    }

    private static void insereElementosAleatorios(List<Item> lista, ArvoreBinaria arvore) {
        Random random = new Random();
        while (!lista.isEmpty()) {
            int indiceAleatorio = random.nextInt(lista.size());
            Item itemAleatorio = lista.get(indiceAleatorio);
            arvore.insere(itemAleatorio);
            lista.remove(itemAleatorio);
        }
    }

    private static void calculaItensOrdenados() {

        ArvoreBinaria arvoreBinaria;
        List<Item> itens;

        System.out.println("Itens aleatórios:");

        // n varia de 1000 a 9000, de 1000 em 1000
        for (int n = 1000; n <= 9000; n += 1000) {
            arvoreBinaria = new ArvoreBinaria();
            itens = criaListaOrdenada(0, n);
            insereElementosOrdenados(itens, arvoreBinaria);

            // avalia tempo de pesquisa            
            long inicio = System.nanoTime();
            Item itemPesquisado = arvoreBinaria.pesquisa(new Item(n));
            long termino = System.nanoTime();

            System.out.println("Tempo - " + n + " itens: " + (termino - inicio));
        }
    }

    private static void calculaItensAleatorios() {

        ArvoreBinaria arvoreBinaria;
        List<Item> itens;

        System.out.println("Itens aleatórios:");

        // n varia de 1000 a 9000, de 1000 em 1000
        for (int n = 1000; n <= 9000; n += 1000) {
            arvoreBinaria = new ArvoreBinaria();
            itens = criaListaOrdenada(0, n);
            insereElementosAleatorios(itens, arvoreBinaria);

            // avalia tempo de pesquisa            
            long inicio = System.nanoTime();
            Item itemPesquisado = arvoreBinaria.pesquisa(new Item(n));
            long termino = System.nanoTime();

            System.out.println("Tempo - " + n + " itens: " + (termino - inicio));
        }
    }

    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {

        // Itens ordenados
        calculaItensOrdenados();

        // Itens aleatórios
        calculaItensAleatorios();

    }

}

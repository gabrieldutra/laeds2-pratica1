package controller;

import java.util.Random;
import model.*;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Itens ordenados:");

        ArvoreBinaria a = new ArvoreBinaria();

        // Inserindo 1000 elementos na arvore
        for (int i = 0; i < 1000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        long inicio = System.nanoTime();
        Item b = a.pesquisa(new Item(1000));
        long termino = System.nanoTime();

        System.out.println("Tempo - 1000 itens: " + (termino - inicio));

        // Inserindo mais 1000 elementos na arvore
        for (int i = 1000; i < 2000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(2000));
        termino = System.nanoTime();

        System.out.println("Tempo - 2000 itens: " + (termino - inicio));

        // Inserindo mais 1000 elementos na arvore
        for (int i = 2000; i < 3000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(3000));
        termino = System.nanoTime();

        System.out.println("Tempo - 3000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 3000; i < 4000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(4000));
        termino = System.nanoTime();

        System.out.println("Tempo - 4000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 4000; i < 5000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(5000));
        termino = System.nanoTime();

        System.out.println("Tempo - 5000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 5000; i < 6000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(6000));
        termino = System.nanoTime();

        System.out.println("Tempo - 6000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 6000; i < 7000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(7000));
        termino = System.nanoTime();

        System.out.println("Tempo - 7000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 7000; i < 8000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(8000));
        termino = System.nanoTime();

        System.out.println("Tempo - 8000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 8000; i < 9000; i++) {
            Item t = new Item(i);
            a.insere(t);
        }

        inicio = System.nanoTime();
        b = a.pesquisa(new Item(9000));
        termino = System.nanoTime();

        System.out.println("Tempo - 9000 itens: " + (termino - inicio));

        System.out.println("Itens aleatórios:");

        ArvoreBinaria c = new ArvoreBinaria();

        Random r = new Random();

        // Inserindo 1000 elementos na arvore
        for (int i = 0; i < 1000; i++) {
            long j = r.nextInt();
            System.out.println(j);
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(1001));
        termino = System.nanoTime();

        System.out.println("Tempo - 1000 itens: " + (termino - inicio));

        // Inserindo mais 1000 elementos na arvore
        for (int i = 1000; i < 2000; i++) {
            long j = r.nextInt() + 1000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(2001));
        termino = System.nanoTime();

        System.out.println("Tempo - 2000 itens: " + (termino - inicio));

        // Inserindo mais 1000 elementos na arvore
        for (int i = 2000; i < 3000; i++) {
            long j = r.nextInt() + 2000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(3001));
        termino = System.nanoTime();

        System.out.println("Tempo - 3000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 3000; i < 4000; i++) {
            long j = r.nextInt() + 3000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(4001));
        termino = System.nanoTime();

        System.out.println("Tempo - 4000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 4000; i < 5000; i++) {
            long j = r.nextInt() + 4000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(5001));
        termino = System.nanoTime();

        System.out.println("Tempo - 5000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 5000; i < 6000; i++) {
            long j = r.nextInt() + 5000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(6001));
        termino = System.nanoTime();

        System.out.println("Tempo - 6000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 6000; i < 7000; i++) {
            long j = r.nextInt() + 6000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(7001));
        termino = System.nanoTime();

        System.out.println("Tempo - 7000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 7000; i < 8000; i++) {
            long j = r.nextInt() + 7000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(8001));
        termino = System.nanoTime();

        System.out.println("Tempo - 8000 itens: " + (termino - inicio));

        // Inserindo 1000 elementos na arvore
        for (int i = 8000; i < 9000; i++) {
            long j = r.nextInt() + 8000;
            Item t = new Item((int) j);
            c.insere(t);
        }

        inicio = System.nanoTime();
        b = c.pesquisa(new Item(9001));
        termino = System.nanoTime();

        System.out.println("Tempo - 9000 itens: " + (termino - inicio));

    }

}

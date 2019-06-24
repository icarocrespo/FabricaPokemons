package testes;

import estruturas.Arvore;
import main.GeradorDePokemon;
import main.Main;
import main.Pokemon;
import nodos.NodoA;

public class TesteA {

    Arvore arvore1;
    Arvore arvore2;
    Arvore arvore3;

    public TesteA() {
        arvore1 = new Arvore();
        arvore2 = new Arvore();
        arvore3 = new Arvore();
    }

    // Ordem 10000
    public void gera10000(GeradorDePokemon geradorDePokemon) {
        System.out.println("10000");
        NodoA nodo;
        Pokemon pokemon;
        for (int i = 0; i < 10000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoA();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            arvore1.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo10000() {
        System.out.println("Existem " + arvore1.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico10000() {
        arvore1.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua10000() {
        arvore1.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    // Ordem 100000
    public void gera100000(GeradorDePokemon geradorDePokemon) {
        System.out.println("100000");
        NodoA nodo;
        Pokemon pokemon;
        for (int i = 0; i < 100000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoA();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            arvore2.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo100000() {
        System.out.println("Existem " + arvore2.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico100000() {
        arvore2.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua100000() {
        arvore2.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    // Ordem 1000000
    public void gera1000000(GeradorDePokemon geradorDePokemon) {
        System.out.println("1000000");
        NodoA nodo;
        Pokemon pokemon;
        for (int i = 0; i < 1000000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoA();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            arvore3.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo1000000() {
        System.out.println("Existem " + arvore3.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico1000000() {
        arvore3.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua1000000() {
        arvore3.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
}

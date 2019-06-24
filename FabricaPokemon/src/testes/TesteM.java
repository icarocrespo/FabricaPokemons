package testes;

import estruturas.Mapa;
import main.GeradorDePokemon;
import main.Main;
import main.Pokemon;
import nodos.NodoM;

public class TesteM {

    Mapa mapa1;
    Mapa mapa2;
    Mapa mapa3;

    public TesteM() {
        mapa1 = new Mapa();
        mapa2 = new Mapa();
        mapa3 = new Mapa();
    }

    // Ordem 10000
    public void gera10000(GeradorDePokemon geradorDePokemon) {
        System.out.println("10000");
        NodoM nodo;
        Pokemon pokemon;
        for (int i = 0; i < 10000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoM();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            mapa1.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo10000() {
        System.out.println("Existem " + mapa1.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico10000() {
        mapa1.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua10000() {
        mapa1.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
    
    
    // Ordem 100000
    public void gera100000(GeradorDePokemon geradorDePokemon) {
        System.out.println("100000");
        NodoM nodo;
        Pokemon pokemon;
        for (int i = 0; i < 100000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoM();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            mapa2.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo100000() {
        System.out.println("Existem " + mapa2.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico100000() {
        mapa2.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua100000() {
        mapa2.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
    
    
    // Ordem 1000000
    public void gera1000000(GeradorDePokemon geradorDePokemon) {
        System.out.println("1000000");
        NodoM nodo;
        Pokemon pokemon;
        for (int i = 0; i < 1000000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoM();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setPokemon(pokemon);
            mapa3.add(nodo);
        }

        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
    
    public void contaFogo1000000() {
        System.out.println("Existem " + mapa3.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico1000000() {
        mapa3.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua1000000() {
        mapa3.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
}

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

    long antes;
    long depois;
    
    public TesteM() {
        mapa1 = new Mapa();
        mapa2 = new Mapa();
        mapa3 = new Mapa();
    }

    // Ordem 10000
    public Mapa gera10000(GeradorDePokemon geradorDePokemon) {
        System.out.println("10000");
        antes = Main.time(antes, depois);
        NodoM nodo;
        Pokemon pokemon;
        for (int i = 0; i < 10000; i++) {
            pokemon = new Pokemon();
            nodo = new NodoM();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            nodo.setChave(Mapa.next());
            nodo.setPokemon(pokemon);
            mapa1.add(nodo);
        }
        depois = Main.time(antes, depois);
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        return mapa1;
    }

    public void contaFogo10000() {
        antes = Main.time(antes, depois);
        System.out.println("Existem " + mapa1.searchTypeFire() + "do tipo fogo.");
        depois = Main.time(antes, depois);
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void alfabetico10000() {
        System.out.println("Ordem Alfabética");
        antes = Main.time(antes, depois);
        mapa1.showAllAlphabetic();
        depois = Main.time(antes, depois);
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }

    public void removeAgua10000() {
        System.out.println("Remove Água");
        antes = Main.time(antes, depois);
        mapa1.removeAllWater();
        depois = Main.time(antes, depois);
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }
    
    
    // Ordem 100000
    public Mapa gera100000(GeradorDePokemon geradorDePokemon) {
        System.out.println("100000");
        antes = Main.nanoTime();
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
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
        return mapa2;
    }

    public void contaFogo100000() {
        antes = Main.nanoTime();
        System.out.println("Existem " + mapa2.searchTypeFire() + "do tipo fogo.");
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }

    public void alfabetico100000() {
        System.out.println("Ordem Alfabética");
        antes = Main.nanoTime();
        mapa2.showAllAlphabetic();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }

    public void removeAgua100000() {
        System.out.println("Remove Água");
        antes = Main.nanoTime();
        mapa2.removeAllWater();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }
    
    
    // Ordem 1000000
    public Mapa gera1000000(GeradorDePokemon geradorDePokemon) {
        System.out.println("1000000");
        antes = Main.nanoTime();
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
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
        return mapa3;
    }
    
    public void contaFogo1000000() {
        antes = Main.nanoTime();
        System.out.println("Existem " + mapa3.searchTypeFire() + "do tipo fogo.");
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void alfabetico1000000() {
        System.out.println("Ordem Alfabética");
        antes = Main.nanoTime();
        mapa3.showAllAlphabetic();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void removeAgua1000000() {
        System.out.println("Remove Água");
        antes = Main.nanoTime();
        mapa3.removeAllWater();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }
}

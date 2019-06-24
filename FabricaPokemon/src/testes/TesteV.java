package testes;

import estruturas.Vetor;
import main.GeradorDePokemon;
import main.Main;
import main.Pokemon;

public class TesteV {

    Vetor vetor1;
    Vetor vetor2;
    Vetor vetor3;

    public TesteV() {
        this.vetor1 = new Vetor(10000);
        this.vetor2 = new Vetor(100000);
        this.vetor3 = new Vetor(1000000);
    }

    // Ordem 10000
    public void gera10000(GeradorDePokemon geradorDePokemon) {
        System.out.println("10000");
        Pokemon pokemon;
        for (int i = 0; i < 10000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor1.add(pokemon);
        }
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo10000() {
        System.out.println("Existem " + vetor1.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico10000() {
        vetor1.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua10000() {
        vetor1.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    // Ordem 100000
    public void gera100000(GeradorDePokemon geradorDePokemon) {
        System.out.println("100000");
        Pokemon pokemon;
        for (int i = 0; i < 100000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor2.add(pokemon);
        }
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo100000() {
        System.out.println("Existem " + vetor2.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico100000() {
        vetor2.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua100000() {
        vetor2.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    // Ordem 1000000
    public void gera1000000(GeradorDePokemon geradorDePokemon) {
        System.out.println("1000000");
        Pokemon pokemon;
        for (int i = 0; i < 1000000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor3.add(pokemon);
        }
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void contaFogo1000000() {
        System.out.println("Existem " + vetor3.searchTypeFire() + "do tipo fogo.");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void alfabetico1000000() {
        vetor3.showAllAlphabetic();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }

    public void removeAgua1000000() {
        vetor3.removeAllWater();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
}

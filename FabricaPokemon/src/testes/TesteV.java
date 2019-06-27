package testes;

import estruturas.Vetor;
import main.GeradorDePokemon;
import main.Main;
import main.Pokemon;

public class TesteV {

    Vetor vetor1;
    Vetor vetor2;
    Vetor vetor3;

    long antes;
    long depois;
    
    public TesteV() {
        this.vetor1 = new Vetor(10000);
        this.vetor2 = new Vetor(100000);
        this.vetor3 = new Vetor(1000000);
    }

    // Ordem 10000
    public Vetor gera10000(GeradorDePokemon geradorDePokemon) {
        System.out.println("10000");
        antes = Main.nanoTime();
        Pokemon pokemon;
        for (int i = 0; i < 10000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor1.add(pokemon);
        }
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
        return vetor1;
    }

    public void contaFogo10000(Vetor vetor) {
        antes = Main.nanoTime();
        System.out.println("Existem " + vetor.searchTypeFire() + " do tipo fogo.");
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido: " + Main.time(antes, depois));
        System.out.println();
        
    }

    public void alfabetico10000(Vetor vetor) {
        antes = Main.nanoTime();
        vetor.showAllAlphabetic();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }

    public void removeAgua10000(Vetor vetor) {
        System.out.println("Remoção Água");
        antes = Main.nanoTime();
        vetor.removeAllWater();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        System.out.println();
    }

    // Ordem 100000
    public Vetor gera100000(GeradorDePokemon geradorDePokemon) {
        System.out.println("100000");
        antes = Main.nanoTime();
        Pokemon pokemon;
        for (int i = 0; i < 100000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor2.add(pokemon);
        }
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        return vetor2;
    }

    public void contaFogo100000(Vetor vetor) {
        antes = Main.nanoTime();
        System.out.println("Existem " + vetor.searchTypeFire() + "do tipo fogo.");
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void alfabetico100000(Vetor vetor) {
        System.out.println("Ordenação Alfabética");
        antes = Main.nanoTime();
        vetor.showAllAlphabetic();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        
    }

    public void removeAgua100000(Vetor vetor) {
        System.out.println("Remoção Água");
        antes = Main.nanoTime();
        vetor.removeAllWater();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    // Ordem 1000000
    public Vetor gera1000000(GeradorDePokemon geradorDePokemon) {
        System.out.println("1000000");
        antes = Main.nanoTime();
        Pokemon pokemon;
        for (int i = 0; i < 1000000; i++) {
            pokemon = new Pokemon();
            String[] aux = new String[2];
            aux = geradorDePokemon.geraPokemon();
            pokemon.setNome(aux[0]);
            pokemon.setTipo(aux[1]);

            vetor3.add(pokemon);
        }
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
        return vetor3;
    }

    public void contaFogo1000000(Vetor vetor) {
        antes = Main.nanoTime();
        System.out.println("Existem " + vetor.searchTypeFire() + " do tipo fogo.");
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void alfabetico1000000(Vetor vetor) {
        System.out.println("Ordenação Alfabética");
        antes = Main.nanoTime();
        vetor.showAllAlphabetic();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }

    public void removeAgua1000000(Vetor vetor) {
        System.out.println("Remoção Água");
        antes = Main.nanoTime();
        vetor.removeAllWater();
        depois = Main.nanoTime();
        System.out.println("Tempo decorrido em nanossegundos: " + Main.time(antes, depois));
    }
}
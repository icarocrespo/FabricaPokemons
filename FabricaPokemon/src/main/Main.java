 // Desenvolvido por Ícaro e Marina
package main;

import estruturas.Arvore;
import estruturas.Mapa;
import estruturas.Vetor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import testes.TesteV;

public class Main {

    public static void main(String[] args) {
        Main.mapa();
        Main.vetor();
        Main.arvore();
    }

    public static long nanoTime() {
        return System.currentTimeMillis();
    }

    public static String time(long time) {
        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");
        Date data = new Date(time);
        return data.toString();
    }

    public static void mapa() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();

        System.out.println("Mapa:");
        Mapa mapa = new Mapa();

        System.out.println("10000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
        
        System.out.println("100000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
        
        System.out.println("1000000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));

    }

    public static void vetor() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();
        System.out.println("Vetor");
        
        // testes de inserção de pokemons no vetor
        TesteV vetores = new TesteV();
        
        //Ordem 10000
        vetores.gera10000(geradorDePokemon);
        vetores.contaFogo10000();
        vetores.alfabetico10000();
        vetores.removeAgua10000();
        
        //Ordem 100000
        vetores.gera100000(geradorDePokemon);
        vetores.contaFogo100000();
        vetores.alfabetico100000();
        vetores.removeAgua100000();
        
        //Ordem 1000000
        vetores.gera1000000(geradorDePokemon);
        vetores.contaFogo1000000();
        vetores.alfabetico1000000();
        vetores.removeAgua1000000();
    }

    public static void arvore() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();
        
        System.out.println("Árvore Binária");
        Arvore arvore = new Arvore();

        System.out.println("10000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
        
        System.out.println("100000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
        
        System.out.println("1000000");
        System.out.println("Tempo decorrido em nanossegundos: " + Main.nanoTime());
        System.out.println("Tempo decorrido: " + Main.time(Main.nanoTime()));
    }
}

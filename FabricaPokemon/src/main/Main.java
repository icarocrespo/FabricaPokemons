 // Desenvolvido por Ícaro e Marina
package main;

import estruturas.Arvore;
import estruturas.Mapa;
import estruturas.Vetor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import testes.TesteA;
import testes.TesteM;
import testes.TesteV;

public class Main {

    public static void main(String[] args) {
        Main.mapa();
        //Main.vetor();
        //Main.arvore();
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static long time(long antes, long depois) {
        long tempo;
        antes = antes / 1000;
        depois = depois / 1000;
        
        tempo = depois - antes;
        return tempo;
    }

    public static void mapa() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();
        System.out.println("Mapa:");

        // testes de inserção de pokemons no mapa
        TesteM testeM = new TesteM();
        Mapa mapa10000 = new Mapa();
        Mapa mapa100000 = new Mapa();
        Mapa mapa1000000 = new Mapa();
        
        //Ordem 10000
        mapa10000 = testeM.gera10000(geradorDePokemon);
        testeM.contaFogo10000();
        testeM.alfabetico10000();
        testeM.removeAgua10000();
        
        //Ordem 100000
        mapa100000 = testeM.gera100000(geradorDePokemon);
        testeM.contaFogo100000();
        testeM.alfabetico100000();
        testeM.removeAgua100000();
        
        //Ordem 1000000
        mapa1000000 = testeM.gera1000000(geradorDePokemon);
        testeM.contaFogo1000000();
        testeM.alfabetico1000000();
        testeM.removeAgua1000000();
    }

    public static void vetor() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();
        System.out.println("Vetor");
        
        // testes de inserção de pokemons no vetor
        TesteV testeV = new TesteV();
        
        Vetor vetor10000;
        Vetor vetor100000;
        Vetor vetor1000000;
        
        //Ordem 10000
        vetor10000 = testeV.gera10000(geradorDePokemon);
        testeV.contaFogo10000(vetor10000);
        testeV.alfabetico10000(vetor10000);
        testeV.removeAgua10000(vetor10000);
        
        //Ordem 100000
        vetor100000 = testeV.gera100000(geradorDePokemon);
        testeV.contaFogo100000(vetor100000);
        testeV.alfabetico100000(vetor100000);
        testeV.removeAgua100000(vetor100000);
        
        //Ordem 1000000
        vetor1000000 = testeV.gera1000000(geradorDePokemon);
        testeV.contaFogo1000000(vetor1000000);
        testeV.alfabetico1000000(vetor1000000);
        testeV.removeAgua1000000(vetor1000000);
    
        
    }

    public static void arvore() {
        GeradorDePokemon geradorDePokemon = GeradorDePokemon.getInstancia();
        System.out.println("Arvore binária");
        
        // testes de inserção de pokemons no vetor
        TesteA testeA = new TesteA();
        
        //Ordem 10000
        testeA.gera10000(geradorDePokemon);
        testeA.contaFogo10000();
        testeA.alfabetico10000();
        testeA.removeAgua10000();
        
        //Ordem 100000
        testeA.gera100000(geradorDePokemon);
        testeA.contaFogo100000();
        testeA.alfabetico100000();
        testeA.removeAgua100000();
        
        //Ordem 1000000
        testeA.gera1000000(geradorDePokemon);
        testeA.contaFogo1000000();
        testeA.alfabetico1000000();
        testeA.removeAgua1000000();
    }
}

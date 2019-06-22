 // Desenvolvido por Ícaro e Marina
package main;

import estruturas.Arvore;
import estruturas.Mapa;
import estruturas.Vetor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        System.out.println("Mapa:");
        Mapa mapa = new Mapa();
        
        
    }

    public static void vetor() {
        System.out.println("Vetor");
        
        System.out.println("Vetor com 10000 posições");
        Vetor vetor = new Vetor(10000);

    }

    public static void arvore() {
        System.out.println("Árvore Binária");
        Arvore arvore = new Arvore();
        
        
    }
}

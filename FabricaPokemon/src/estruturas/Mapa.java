package estruturas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import main.Pokemon;
import nodos.Nodo;
import nodos.NodoM;

public class Mapa implements Interface {

    Map<Integer, NodoM> pokemons = new HashMap<>();

    private Pokemon pokemon;
    private static int CHAVE = Mapa.next();
    private int quantidade;

    public Mapa() {
        this.pokemons = null;
        this.pokemon = null;
        quantidade = 0;
        CHAVE = 1;
    }

    public static int next() {
        return CHAVE++;
    }

    @Override
    public boolean add(Nodo generic) {
        NodoM nodo = (NodoM) generic;
        this.pokemons.put(nodo.getChave(), nodo);
        this.quantidade++;
        return true;

    }

    @Override
    public boolean remove(Nodo generic) {
        try {
            NodoM nodo = (NodoM) generic;
            pokemons.remove(nodo.getChave());
            this.quantidade--;
            return true;
        } catch (Exception e) {
            System.out.println("Erro");
            return false;
        }
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public int searchType(String type) {
        int cont = 0;
        try {
            Set<Integer> chaves = pokemons.keySet();
            Integer chave;
            for (Iterator<Integer> iterator = chaves.iterator(); iterator.hasNext();) {
                chave = iterator.next();
                if (chave != null && pokemons.get(chave).getPokemon().getTipo().equals(type)) {
                    cont++;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro");
        }
        return cont;
    }

    @Override
    public int searchTypeFire() {
        return searchType("Fogo");
    }

    @Override
    public void showAllAlphabetic() {

    }

    @Override
    public void removeAllWater() {
        Set<Integer> chaves = pokemons.keySet();
        Integer chave;
        for (Iterator<Integer> iterator = chaves.iterator(); iterator.hasNext();) {
            chave = iterator.next();
            if (chave != null && pokemons.get(chave).getPokemon().getTipo().equals("Agua")) {
                pokemons.remove(chave);
            }
        }
    }

}

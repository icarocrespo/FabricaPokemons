package estruturas;

import java.util.HashMap;
import java.util.Map;
import nodos.NodoA;
import main.Pokemon;
import nodos.Nodo;

public class Mapa {

    Map<Integer, Pokemon> pokemons = new HashMap<>();

    private Pokemon pokemon;
    private int chave;
    private int qtd;

    public Mapa() {
        pokemons = null;
        pokemon = null;
        chave = 0;
    }

    public Mapa(Pokemon pokemon, int chave) {
        this.pokemon = pokemon;
        chave++;
    }

    public boolean add(Pokemon pokemon) {
        try {
            pokemons.put(chave, pokemon);
            chave++;
            return true;
        } catch (Exception e) {
            System.out.println("Erro");
            return false;
        }
    }

    public boolean remove(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        return chave.intValue();
    }

    public int searchType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchTypeFire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllAlphabetic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllWater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

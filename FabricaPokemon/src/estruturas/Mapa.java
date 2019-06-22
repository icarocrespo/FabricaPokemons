package estruturas;

import java.util.HashMap;
import java.util.Map;
import nodos.NodoA;
import main.Pokemon;
import nodos.Nodo;

public class Mapa implements Interface{

    Map<Long, Pokemon> pokemons = new HashMap<Long, Pokemon>();
    
    private Pokemon pokemon;
    private Long chave;
    private Long qtd;
    
    public Mapa(){
        pokemons = null;
        pokemon = null;
        chave = null;
    }
    
    public Mapa(Pokemon pokemon, Long chave){
        this.pokemon = pokemon;
        chave++;
    }

    @Override
    public boolean add(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return chave.intValue();
    }

    @Override
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

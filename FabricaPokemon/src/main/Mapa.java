package main;

import java.util.HashMap;
import java.util.Map;
import util.GenericInterface;

public class Mapa implements GenericInterface{
    Map<Long, Pokemon> pokemons = new HashMap<Long, Pokemon>();
    
    private Pokemon pokemon;
    private Long chave;
    
    public Mapa(){
        pokemons = null;
        pokemon = null;
        chave = null;
    }
    
    public Mapa(Pokemon pokemon, Long chave){
        this.pokemon = pokemon;
        chave++;
    }
    
    public String nanoTime(){
        long tempo = System.nanoTime();
        return "" + tempo + "";
    }

    @Override
    public boolean add(Nodo nodo) {
        
    }

    @Override
    public boolean remove(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllWater() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

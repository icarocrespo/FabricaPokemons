package nodos;

import main.Pokemon;

public class NodoM {
    private final Long chave = 0L;
    private Pokemon pokemon;
    
    public NodoM(){
        this.chave++;
    }
    
    public NodoM(Pokemon pokemon){
        this.chave++;
        this.pokemon = pokemon;
    }

    public NodoM getX() {
        return x;
    }

    public void setX(NodoM x) {
        this.x = x;
    }

    public NodoM getY() {
        return y;
    }

    public void setY(NodoM y) {
        this.y = y;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}

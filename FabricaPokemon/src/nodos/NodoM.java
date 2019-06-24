package nodos;

import main.Pokemon;

public class NodoM extends Nodo {

    private int chave;

    public NodoM(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public NodoM() {

    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}

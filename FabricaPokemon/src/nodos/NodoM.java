package nodos;

import main.Pokemon;

public class NodoM extends Nodo {

    private Integer chave;

    public NodoM(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public NodoM(Pokemon pokemon, Integer chave) {
        this.pokemon = pokemon;
        this.chave = chave;
    }
    
    public NodoM() {

    }

    public Integer getChave() {
        return chave;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}

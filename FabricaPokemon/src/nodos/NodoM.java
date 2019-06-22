package nodos;

import main.Pokemon;

public class NodoM extends Nodo{
    private static Long CHAVE = 0L;
    private Pokemon pokemon;
    private Long chave;
    
    public NodoM(){
        CHAVE++;
        this.chave = CHAVE;
    }
    
    public NodoM(Pokemon pokemon){
        CHAVE++;
        this.chave = CHAVE;
        this.pokemon = pokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Long getChave() {
        return chave;
    }

}

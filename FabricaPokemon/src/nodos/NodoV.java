package nodos;

import main.Pokemon;

public class NodoV extends Nodo{
    private Pokemon pokemon;
    
    public NodoV(){
        
    }
    
    public NodoV(Pokemon pokemon){
        this.pokemon = pokemon;
    }
    
    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}

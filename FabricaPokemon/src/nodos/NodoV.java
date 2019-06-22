package nodos;

import main.Pokemon;

public class NodoV {
    private NodoV esquerda;
    private NodoV direita;
    private Pokemon pokemon;
    
    public NodoV(){
        this.esquerda = null;
        this.esquerda = null;
    }
    
    public NodoV(NodoV esquerda, NodoV direita, Pokemon pokemon){
        this.esquerda = esquerda;
        this.direita = direita;
        this.pokemon = pokemon;
    }

    public NodoV getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NodoV esquerda) {
        this.esquerda = esquerda;
    }

    public NodoV getDireita() {
        return direita;
    }

    public void setDireita(NodoV direita) {
        this.direita = direita;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}

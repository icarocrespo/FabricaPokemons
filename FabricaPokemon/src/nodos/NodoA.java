package nodos;

import main.Pokemon;

public class NodoA {
    private NodoA esquerda;
    private NodoA direita;
    private Pokemon pokemon;
    
    public NodoA(){
        this.esquerda = null;
        this.esquerda = null;
    }
    
    public NodoA(NodoA esquerda, NodoA direita, Pokemon pokemon){
        this.esquerda = esquerda;
        this.direita = direita;
        this.pokemon = pokemon;
    }

    public NodoA getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NodoA esquerda) {
        this.esquerda = esquerda;
    }

    public NodoA getDireita() {
        return direita;
    }

    public void setDireita(NodoA direita) {
        this.direita = direita;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    
}

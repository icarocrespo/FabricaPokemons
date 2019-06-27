package nodos;

import main.Pokemon;

public class NodoA extends Nodo {
    private NodoA esquerda;
    private NodoA direita;
    private static Integer CHAVE;
    private int chave;
    
    public NodoA(){
        this.esquerda = null;
        this.esquerda = null;
        this.pokemon = null;
        this.chave = 0;
    }
    
    public NodoA(NodoA esquerda, NodoA direita, Pokemon pokemon, int chave){
        this.esquerda = esquerda;
        this.direita = direita;
        this.pokemon = pokemon;
        this.chave = chave;
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

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    private void alterKey(){
        if((CHAVE.toString()).charAt(0) == '-'){
            CHAVE = (2 * CHAVE) + (CHAVE * -1) + 1;
            
        }else{
            CHAVE = (2 * CHAVE) + (CHAVE * -1) -1;
        }
    }
}

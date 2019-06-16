package main;

public class Nodo {
    private Nodo x;
    private Nodo y;
    private Pokemon pokemon;
    
    public Nodo(){
        this.x = null;
        this.x = null;
    }
    
    public Nodo(Nodo x, Nodo y, Pokemon pokemon){
        this.x = x;
        this.y = y;
        this.pokemon = pokemon;
    }
}

package estruturas;

import nodos.NodoA;
import util.GenericInterface;

public class Arvore implements GenericInterface {

    private NodoA raiz;

    public Arvore() {
    }

    public Arvore(NodoA raiz) {
        this.raiz = raiz;
    }

    @Override
    public boolean add(NodoA nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(NodoA nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return size(this.raiz);
    }

    public int size(NodoA nodo){
    if (nodo == null) {
            return 0;
        }
        return size(nodo.getX()) + 1
                + size(nodo.getY());
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

    public NodoA getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }
}
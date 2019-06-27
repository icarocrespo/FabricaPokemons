package estruturas;

import nodos.Nodo;
import nodos.NodoA;

public class Arvore implements Interface {

    private NodoA raiz;

    public Arvore() {
    }

    public Arvore(NodoA raiz) {
        this.raiz = raiz;
    }

    @Override
    public boolean add(Nodo nodo) {
        return add(raiz, (NodoA) nodo);
    }

    public boolean add(NodoA atual, NodoA novo) {
        if (novo.getChave() == atual.getChave()) {
            return false;
        } else if (novo.getChave() < chave) {
            if (atual.getEsquerda()== null) {
                atual.setEsquerda(novo);
                return true;
            } else {
                return add(atual.getEsquerda(), novo);
            }
        } else {
            if (atual.getDireita()== null) {
                atual.setDireita(novo);
                return true;
            } else {
                return add(atual.getDireita(), novo);
            }
        }
    }

    @Override
    public boolean remove(Nodo nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return size(this.raiz);
    }

    public int size(NodoA atual) {
        if (atual == null) {
            return 0;
        }
        return size(atual.getEsquerda()) + 1
                + size(atual.getDireita());
    }

    @Override
    public int searchType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchTypeFire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllAlphabetic() {
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

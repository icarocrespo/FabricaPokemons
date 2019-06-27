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
        } else if (novo.getChave() < atual.getChave()) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
                return true;
            } else {
                return add(atual.getEsquerda(), novo);
            }
        } else {
            if (atual.getDireita() == null) {
                atual.setDireita(novo);
                return true;
            } else {
                return add(atual.getDireita(), novo);
            }
        }
    }

    @Override
    public boolean remove(Nodo generic) {
        NodoA nodo = (NodoA) generic;
        NodoA atual = raiz;
        NodoA pai = raiz;
        return remove(atual, pai, nodo.getChave());
    }

    public boolean remove(NodoA atual, NodoA pai, int chave) {
        if (atual == null) {
            return false;
        } else if (atual.getChave() == chave) {
            return removeEncontrado(atual, pai);
        } else if (atual.getChave() > chave) {
            return remove(atual.getEsquerda(), atual, chave);
        } else {
            return remove(atual.getDireita(), atual, chave); //desce a direita
        }
    }

    public boolean removeEncontrado(NodoA atual, NodoA pai) {
        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return removeFolha(atual, pai);
        } else if (atual.getEsquerda() == null || atual.getDireita() == null) {
            return removeUmFilho(atual, pai);
        } else {
            return removeDoisFilhos(atual, pai);
        }
    }

    private boolean removeFolha(NodoA atual, NodoA pai) {
        if (atual == raiz) {
            raiz = null;
        } else if (pai.getEsquerda() == atual) {
            pai.setEsquerda(null);
        } else {
            pai.setDireita(null);
        }
        return true;
    }

    private boolean removeUmFilho(NodoA atual, NodoA pai) {
        if (atual == raiz) {
            if (atual.getEsquerda() != null) {
                raiz = atual.getEsquerda();
            } else {
                raiz = atual.getDireita();
            }
        } else if (pai.getEsquerda() == atual) {
            if (atual.getEsquerda() != null) {
                pai.setEsquerda(atual.getEsquerda());
            } else {
                pai.setEsquerda(atual.getDireita());
            }
        } else {
            if (atual.getEsquerda() != null) {
                pai.setDireita(atual.getEsquerda());
            } else {
                pai.setDireita(atual.getDireita());
            }
        }
        return true;
    }

    private boolean removeDoisFilhos(NodoA atual, NodoA pai) {
        NodoA sucessor = atual.getDireita();
        NodoA paiSucessor = atual;
        while (sucessor.getEsquerda()!= null) {
            paiSucessor = sucessor;
            sucessor = sucessor.getEsquerda();
        }
        if (sucessor == atual.getDireita()) {
            sucessor.setEsquerda(atual.getEsquerda());
            if (atual == raiz) {
                raiz = sucessor;
            } else if (pai.getEsquerda()== atual) {
                pai.setEsquerda(sucessor);
            } else {
                pai.setDireita(sucessor);
            }
        } else {
            sucessor.setEsquerda(atual.getEsquerda());
            if (atual == raiz) {
                raiz = sucessor;
            } else if (pai.getEsquerda()== atual) {
                pai.setEsquerda(sucessor);
            } else {
                pai.setDireita(sucessor);
            }
        } //nodo a esquerda
        return true;
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
        int cont = 0;
        if (raiz == null) {
            return 0;
        }
        return size(raiz);
    }
    

    @Override
    public int searchTypeFire() {
        return searchType("Fire");
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

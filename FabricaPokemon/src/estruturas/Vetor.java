package estruturas;

import nodos.Nodo;
import nodos.NodoV;

public class Vetor implements Interface {

    private int numElementos;
    private NodoV[] nodos;

    public Vetor(int tamanho) {
        this.nodos = new NodoV[tamanho];
        numElementos = 0;
    }

    @Override
    public boolean add(Nodo nodo) {
        NodoV nodoV = (NodoV) nodo;
        if (!(this.numElementos != this.nodos.length)) {
            nodos[numElementos] = nodoV;
            numElementos++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Nodo nodo) {
        NodoV nodoV = (NodoV) nodo;

        int indice = indexOf(nodoV);
        if (indice != -1) {
            for (int i = indice; i < (numElementos - 1); i++) {
                nodos[i] = nodos[i + 1];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return numElementos;
    }

    @Override
    public int searchType(String type) {
        int cont = 0;
        for (int i = 0; i < numElementos; i++) {
            if (nodos[i].getPokemon().getTipo().contains(type)) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public void showAllAlphabetic() {
        NodoV[] aux = new NodoV[nodos.length];
        //Collator collator = Collator.getInstance();

        for (int i = 0; i < nodos.length; i++) {
            for (int j = 0; j < nodos.length; j++) {
                if (nodos[i].getPokemon().getNome().compareTo(nodos[j].getPokemon().getNome()) < 0) {
                    aux[i] = nodos[j];
                }
            }
        }
        String vetorString = "[";
        for (int i = 0; i < numElementos; i++) {
            vetorString += aux[i]
                    + "";
        }
        vetorString += "]";
        System.out.println(vetorString);
    }

    public void showAll() {
        String vetorString = "[";
        for (int i = 0; i < numElementos; i++) {
            vetorString += nodos[i]
                    + "";
        }
        vetorString += "]";
        System.out.println(vetorString);;
    }

    @Override
    public void removeAllWater() {
        for (int i = 0; i < numElementos; i++) {
            if (nodos[i].getPokemon().getTipo().contains("Agua")) {
                remove(nodos[i]);
            }
        }
    }

    public int indexOf(NodoV nodo) {
        for (int i = 0; i < numElementos; i++) {
            if (nodos[i] == nodo) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int searchTypeFire() {
        return searchType("Fogo");
    }

}

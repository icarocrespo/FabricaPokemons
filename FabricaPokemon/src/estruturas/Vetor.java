package estruturas;

import main.Pokemon;

public class Vetor {

    private int numElementos;
    private Pokemon[] pokemons;

    public Vetor(int tamanho) {
        this.pokemons = new Pokemon[tamanho];
        numElementos = 0;
    }

    public boolean add(Pokemon pokemon) {
        if (!(this.numElementos != this.pokemons.length)) {
            pokemons[numElementos] = pokemon;
            numElementos++;
            return true;
        }
        return false;
    }

    public boolean remove(Pokemon pokemon) {
        int indice = indexOf(pokemon);
        if (indice != -1) {
            for (int i = indice; i < (numElementos - 1); i++) {
                pokemons[i] = pokemons[i + 1];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    public int size() {
        return numElementos;
    }

    public int searchType(String type) {
        int cont = 0;
        for (int i = 0; i < numElementos; i++) {
            if (pokemons[i].getTipo().contains(type)) {
                cont++;
            }
        }
        return cont;
    }

    public void showAllAlphabetic() {
        Pokemon[] aux = new Pokemon[pokemons.length];
        //Collator collator = Collator.getInstance();

        for (int i = 0; i < pokemons.length; i++) {
            for (int j = 0; j < pokemons.length; j++) {
                if (pokemons[i].getNome().compareTo(pokemons[j].getNome()) < 0) {
                    aux[i] = pokemons[j];
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
            vetorString += pokemons[i]
                    + "";
        }
        vetorString += "]";
        System.out.println(vetorString);;
    }

    public void removeAllWater() {
        for (int i = 0; i < numElementos; i++) {
            if (pokemons[i].getTipo().contains("Agua")) {
                remove(pokemons[i]);
            }
        }
    }

    public int indexOf(Pokemon nodo) {
        for (int i = 0; i < numElementos; i++) {
            if (pokemons[i] == nodo) {
                return i;
            }
        }
        return -1;
    }

    public int searchTypeFire() {
        return searchType("Fogo");
    }

}

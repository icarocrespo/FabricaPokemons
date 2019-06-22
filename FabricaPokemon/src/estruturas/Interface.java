package estruturas;

import nodos.Nodo;

public interface Interface {

    public boolean add(Nodo nodo);

    public boolean remove(Nodo nodo);

    public int size();

    public int searchType(String type);
    
    public int searchTypeFire();

    public void showAllAlphabetic();
    
    public void removeAllWater();

}

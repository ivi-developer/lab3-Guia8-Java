package punto3;

import java.util.TreeSet;

public class GestoraPunto3 {
    private TreeSet<Evento> arbol;
    public GestoraPunto3(){arbol=new TreeSet<>(new CriterioArbol());}
    public void agregarArbol(Evento evento){arbol.add(evento);}
    public void mostrarArbol(){System.out.println(arbol);}
}

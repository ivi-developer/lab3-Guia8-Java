package punto2;

import java.util.*;

public class Historial {
    Set<String> historial;
    public Historial(){historial=new LinkedHashSet<>();}
    public void busaqueda(String busqueda){
        historial.add(busqueda);
    }
    public void mostrarBusqueda(){
        System.out.println(historial);
        LinkedList<String>lista=new LinkedList<>(historial);
        Collections.reverse(lista);
        System.out.println(lista);
    }
}

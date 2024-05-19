package punto3;

import java.util.Comparator;

public class CriterioArbol implements Comparator<Evento> {
    @Override
    public int compare(Evento o1, Evento o2) {
        int comparacion=o1.getPrioridad().compareTo(o2.getPrioridad());
        if(comparacion==0)comparacion=o1.getFecha().compareTo(o2.getFecha());
        if(comparacion==0)return o1.getNombre().compareTo(o2.getNombre());
        return comparacion;
    }
}

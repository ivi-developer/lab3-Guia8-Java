package punto3;

import java.time.LocalDate;

public class Evento {
    private Prioridades prioridad;
    private String nombre;
    private LocalDate fecha;
    public Evento(Prioridades prioridad,String nombre,LocalDate fecha){
        this.prioridad=prioridad;
        this.nombre=nombre;
        this.fecha=fecha;
    }
    public Prioridades getPrioridad(){return prioridad;}
    public void setPrioridad(Prioridades prioridad){this.prioridad = prioridad;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public LocalDate getFecha(){return fecha;}
    public void setFecha(LocalDate fecha){this.fecha = fecha;}
    @Override
    public String toString() {
        return "Evento{" +
                "prioridad=" + prioridad +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

package punto5;

import java.util.*;

public class Usuario {
    private String nombre;
    private Queue<Publicacion> publicaciones;
    private ArrayList<Usuario>seguidos;
    public Usuario(String nombre) {
        this.nombre = nombre;
        publicaciones=new LinkedList<>();
        seguidos=new ArrayList<>();
    }
    protected void agregarPublicaciones(Publicacion publicacion){publicaciones.add(publicacion);}
    protected void seguirUsuario(Usuario usuario){seguidos.add(usuario);}
    @Override
    public String toString(){return nombre;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public Queue<Publicacion> getPublicaciones(){return publicaciones;}
    public void setPublicaciones(Queue<Publicacion> publicaciones){this.publicaciones = publicaciones;}
    public ArrayList<Usuario> getSeguidos(){return seguidos;}
    public void setSeguidos(ArrayList<Usuario> seguidos){this.seguidos = seguidos;}
}

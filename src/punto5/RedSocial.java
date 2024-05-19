package punto5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RedSocial {
    private LinkedHashMap<Usuario, ArrayList<Usuario>> usuarios;
    public RedSocial(){usuarios=new LinkedHashMap<>();}
    public void agregarUsuario(Usuario usuario){usuarios.put(usuario,new ArrayList<>());}
    public void seguirUsuario(Usuario usuario,Usuario usuarioASeguir){
        usuario.seguirUsuario(usuarioASeguir);
        usuarios.get(usuarioASeguir).add(usuario);
    }
    public void agregarPublicacion(Usuario usuario,Publicacion publicacion){usuario.agregarPublicaciones(publicacion);}
    public void mostrarTodo() {
        Iterator<Map.Entry<Usuario, ArrayList<Usuario>>> iterator = usuarios.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Usuario, ArrayList<Usuario>> entry = iterator.next();
            Usuario usuario = entry.getKey();
            ArrayList<Usuario> seguidores = entry.getValue();
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Publicaciones: " + usuario.getPublicaciones());
            System.out.print("Seguidores: ");
            if (!seguidores.isEmpty()) {
                for (Usuario seguidor : seguidores) {
                    System.out.print(seguidor.getNombre() + ", ");
                }
                System.out.println();
            } else {
                System.out.println("Ninguno");
            }
            System.out.println("Seguidos: "+usuario.getSeguidos());
            System.out.println();
        }
    }
}

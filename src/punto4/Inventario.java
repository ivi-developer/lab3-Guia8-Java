package punto4;

import java.util.*;

public class Inventario {
    private HashMap<String,Producto>inventario;
    public Inventario(){inventario=new HashMap<>();}
    public void agregarProducto(String nombre,Producto producto){inventario.put(nombre,producto);}
    public void actualizarPrecio(String nombre,Double precio){inventario.get(nombre).setPrecio(precio);}
    public void actualizarStock(String nombre,Integer stock){inventario.get(nombre).setStock(stock);}
    public void comprarProdcuto(String nombre){inventario.get(nombre).reducirStock();}
    public void mostrarOrdenadoAlfabeticamente(){
        TreeMap<String,Producto>arbol=new TreeMap<>(inventario);
        System.out.println(arbol);
    }
}

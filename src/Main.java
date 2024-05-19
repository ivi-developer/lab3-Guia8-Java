import punto2.Historial;
import punto3.Evento;
import punto3.GestoraPunto3;
import punto3.Prioridades;
import punto4.Inventario;
import punto4.Producto;
import punto5.Publicacion;
import punto5.RedSocial;
import punto5.Usuario;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        menu(scanner);
    }
    public static void menu(Scanner scanner){
        do {
            System.out.println("Ingrese ejercicio");
            switch(scanner.nextInt()){
                case 1:
                    punto1(scanner);
                    break;
                case 2:
                    punto2();
                    break;
                case 3:
                    punto3();
                    break;
                case 4:
                    punto4();
                    break;
                case 5:
                    punto5();
                    break;
                default:
                    System.out.println("Flashaste wachin");
                    break;
            }
            System.out.println("n para cortar");
        }while(!scanner.next().equalsIgnoreCase("n"));
    }
    public static void punto1(Scanner scanner){
        scanner.nextLine();
        System.out.println("Ingrese el texto");
        String texto= scanner.nextLine();
        Set<String> hola=Arrays.stream(texto.split("\\s+")).map(String::toLowerCase).collect(Collectors.toCollection(HashSet::new));
        List<String>chau=hola.stream().sorted(String::compareTo).collect(Collectors.toCollection(ArrayList::new));
        hola.addAll(chau);
        System.out.println("la lista");
        System.out.println(chau);
        System.out.println("el hashSet");
        System.out.println(hola);
    }
    public static void punto2(){
        Historial historial=new Historial();
        historial.busaqueda("culos gordos");
        historial.busaqueda("culos flacos");
        historial.busaqueda("gordos flacos");
        historial.busaqueda("flacos gordos");
        historial.busaqueda("culos culos");
        historial.mostrarBusqueda();
    }
    public static void punto3(){
        Evento evento=new Evento(Prioridades.ALTA,"tomar mate", LocalDate.now());
        Evento evento1=new Evento(Prioridades.BAJA,"tomar otro mate",LocalDate.now());
        Evento evento2=new Evento(Prioridades.MEDIA,"tomar todos los mates",LocalDate.now());
        Evento evento3=new Evento(Prioridades.MEDIA,"tomar mate toda la vida",LocalDate.now());
        GestoraPunto3 gestoraPunto3=new GestoraPunto3();
        gestoraPunto3.agregarArbol(evento);gestoraPunto3.agregarArbol(evento1);gestoraPunto3.agregarArbol(evento2);gestoraPunto3.agregarArbol(evento3);
        gestoraPunto3.mostrarArbol();
    }
    public static void punto4(){
        Producto producto=new Producto(5000.0,5);
        Producto producto1=new Producto(6000.0,8);
        Producto producto2=new Producto(8000.0,9);
        Inventario inventario=new Inventario();
        inventario.agregarProducto("molleja",producto);inventario.agregarProducto("chinchu",producto1);inventario.agregarProducto("entrania",producto2);
        inventario.actualizarPrecio("molleja",6000.0);
        inventario.actualizarStock("chinchu",18);
        inventario.comprarProdcuto("entrania");
        inventario.mostrarOrdenadoAlfabeticamente();
    }
    public static void punto5(){
        Usuario ivi=new Usuario("ivi");
        Usuario luchi=new Usuario("luchi");
        Usuario marcos=new Usuario("marcos");
        Usuario pablo=new Usuario("pablo");
        Usuario peke=new Usuario("peke");
        Publicacion publicacion=new Publicacion("tirando peso muerto","foto con 100 kilos");
        Publicacion publicacion1=new Publicacion("pr sentadila", "foto de la barra con 100 kilos");
        Publicacion publicacion2=new Publicacion("pechito","foto con 100 kilos en press banca");
        RedSocial redSocial=new RedSocial();
        redSocial.agregarUsuario(ivi);redSocial.agregarUsuario(luchi);redSocial.agregarUsuario(marcos);redSocial.agregarUsuario(pablo);redSocial.agregarUsuario(peke);
        redSocial.agregarPublicacion(ivi,publicacion);redSocial.agregarPublicacion(ivi,publicacion1);redSocial.agregarPublicacion(ivi,publicacion2);
        redSocial.seguirUsuario(ivi,luchi);
        redSocial.seguirUsuario(ivi, marcos);
        redSocial.seguirUsuario(pablo,peke);
        redSocial.seguirUsuario(peke,ivi);
        redSocial.seguirUsuario(marcos,pablo);
        redSocial.mostrarTodo();
    }
}
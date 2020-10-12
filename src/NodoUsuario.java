
import java.io.Serializable;

/**
 * Clase utilizada para crear nodos 
 * @author marvi
 */
public class NodoUsuario implements Serializable{
    public String usuario;
    public NodoUsuario siguiente;
    public ListaCategoria listacategoria=new ListaCategoria();
   
       /**
        * Metodo constructor para crear objetos de tipo NodoUsuario en una lista simplemente enlazada
        * @param usuario recibe el nombre del usuario para agregar al nodo
        * @param puntero recibe hacia donde apuntara el nodo donde se crea el usuario
        */
    //Constructor para insertar al inicio
    public NodoUsuario(String usuario,NodoUsuario puntero){
        this.usuario = usuario;
        this.siguiente = puntero;
    }    
}

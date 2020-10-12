
import java.io.Serializable;
/**
 * Clase utilizada para crear nodos 
 * @author marvi
 */

public class NodoImagen implements Serializable{
    public String nombreImagen;
    public NodoImagen siguiente,anterior;
    
    /**
     * Metodo constructor para crear objetos de tipo NodoImagen para una lista Circular doblemente enlazada
     * @param nombreImagen recibe el nombre de la imagen para agregarla al nodo
     */
   public NodoImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
        siguiente=null;
        anterior=null;
    }
}

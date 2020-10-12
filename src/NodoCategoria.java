
import java.io.Serializable;

/**
 * Clase utilizada para crear Nodos de una lista simplemente enlazada
 * @author marvi
 */


public class NodoCategoria implements Serializable{
    public String categoria;
    public NodoCategoria siguiente,anterior,puntero;
    public ListaImagen listaimagenes = new ListaImagen();
   
    /**
     * Metodo utilizado para crear objetos de tipo Nodo de un lista simple
     * @param categoria recible el nombre de la categoria nueva
     * @param puntero recibe hacia donde va dirigida esa categoria
     */
    //Constructor para insertar al inicio
    public NodoCategoria(String categoria,NodoCategoria puntero){
        this.categoria = categoria;
        this.siguiente = puntero;
    }           
}

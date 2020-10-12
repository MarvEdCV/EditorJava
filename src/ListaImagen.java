
import javax.swing.JOptionPane;

/**
 * Clase creada para generar listas doblementeenlazadas
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */
public class ListaImagen extends EstructuraDeDatos{
    NodoImagen primero,ultimo,selec;
    int tamanio=0;
    
    /**
     * Metodo contructor para poder crear objetos de tipo ListaCategoria(Lista doblemente enlazada)
     */
    public ListaImagen() {
        primero=ultimo=null;
    }
    
    /**
     * Metodo para agregar nodos a la lista doblemente enlazada, en este caso para agregar "categorias a la lista"
     * @param e recibe el nodo nuevo a agregar
     */
    @Override//Agregar al inicio
    public void add(Object e) {
        String dato = (String)e;
        NodoImagen nuevo = new NodoImagen(dato);
        if(tamanio==0){
            primero = nuevo;
            ultimo=nuevo;
            
            primero.siguiente=ultimo;
            ultimo.siguiente=primero;
            primero.anterior=ultimo;
            ultimo.anterior=primero;
            tamanio++;
        }else{
            NodoImagen aux = primero;
            nuevo.siguiente=aux;
            aux.anterior=nuevo;
            primero=nuevo;
            tamanio++;
            
        }
    }
    
    /**
     * Metodo utilizado para mostrar lo que esta arriba de la lista 
     * @return Devuelve un dato de tipo Object
     */
    @Override
    public Object peek() {
        selec = primero;
        return primero;
    }
    public void mostrar_elementos(){
        if(tamanio!=0){
            NodoImagen aux = primero;
            for(int i=0;i<tamanio;i++){
                System.out.println(aux.nombreImagen+"-");
                aux=aux.siguiente;
            }if(tamanio==0){
                JOptionPane.showMessageDialog(null, "No hay imagenes aun");
            }
        }
    }

     /**
     * Metodo utilizado para realizar una busqueda a travez de todos los nodos de la lista doblemente enlazada
     * @param e recibe el nodo a buscar
     * @return Nos devueve un dato de tipo Object que nos dice si esta o no el nodo buscado
     */
    @Override
    public Object find(Object e) {
        String nuevo = (String)e;
        String respuesta="";
        NodoImagen temporal = primero;
        while(temporal!=null && !temporal.nombreImagen.equals(nuevo)){
            temporal = temporal.siguiente;
        }if(temporal!=null){
            respuesta="Si";
        }else if(temporal==null){
            respuesta="No";
        }
        
      return respuesta;
    }

    @Override
    public Object getNext() {
       
        return null;
        
    }

    @Override
    public Object getPrevius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Metodo utilizado para eliminar algun nodo en especifico de la lista completa
     * @param e recibe el nodo a eliminar
     */
    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

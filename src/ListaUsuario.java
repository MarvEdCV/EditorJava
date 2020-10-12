/**
 * Clase creada para generar listas simplemente enlazadas 
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */




public class ListaUsuario extends EstructuraDeDatos {
    //Punteros para saber donde esta el inicio y el final
    public NodoUsuario inicio,recorer;
    public NodoUsuario fin;
    public NodoUsuario seleccion;
    
    /**
     * Metodo contructor para poder crear objetos de tipo ListaCategoria(Lista doblemente enlazada)
     */
    public ListaUsuario() {
       inicio = null;
        fin = null;
    }
    
    /**
     * Metodo para agregar nodos a la lista doblemente enlazada, en este caso para agregar "categorias a la lista"
     * @param e recibe el nodo nuevo a agregar
     */
    @Override
    public void add(Object e) {
     //Casteando el objeto
     String nuevo = (String)e;
     //Creando al nodo
     inicio = new NodoUsuario(nuevo, inicio);
     if(fin== null){
         fin=inicio;  
     }
     
     }
     public void mostrarLista(){
         NodoUsuario recorrer = inicio;
         System.out.println();
     while(recorrer!=null){
         System.out.print("["+recorrer.usuario+"]--->");
         recorrer = recorrer.siguiente;
     }
     }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    /**
     * Metodo utilizado para realizar una busqueda a travez de todos los nodos de la lista doblemente enlazada
     * @param e recibe el nodo a buscar
     * @return Nos devueve un dato de tipo Object que nos dice si esta o no el nodo buscado
     */
    @Override
    public Object find(Object e) {
        String respuesta="";
        String nuevo = (String)e;
        //Buscando
        NodoUsuario temporal = inicio;
        while(temporal != null && !temporal.usuario.equals(nuevo)){
            temporal = temporal.siguiente;
        }
        if(temporal != null){ 
            respuesta="Si";
            seleccion = temporal;
        }else if(temporal == null){
            respuesta ="No";
                    }
        return respuesta;
     }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

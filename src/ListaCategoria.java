
import javax.swing.JOptionPane;
 
/**
 * Clase creada para generar listas doblementeenlazadas
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */
public class ListaCategoria extends EstructuraDeDatos {
    public NodoCategoria inicio,fin,recorrer,nodoseleccion;
    public int size=0;
    public ListaImagen listaImagen;
    
    /**
     * Metodo contructor para poder crear objetos de tipo ListaCategoria(Lista doblemente enlazada)
     */
    public ListaCategoria() {
        inicio=fin=null; 
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
     inicio = new NodoCategoria(nuevo, inicio);
     if(fin== null){
         fin=inicio;  
     }
     //inicio.listacategoria.add("General");
     }
    
    
     public void mostrarLista(){
         NodoCategoria recorrer = inicio;
         System.out.println();
     while(recorrer!=null){
         System.out.print("["+recorrer.categoria+"]--->");
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
        NodoCategoria temporal = inicio;
        while(temporal != null && !temporal.categoria.equals(nuevo)){
            temporal = temporal.siguiente;
        }
        if(temporal != null){ 
            respuesta="Si";
            
        }else if(temporal == null){
            respuesta ="No";
            nodoseleccion=temporal;
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
         String respuesta="";
       String nuevo = (String)e;
       if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio!=null){
         if(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio==VentanaPrincipal.listaUsuario.seleccion.listacategoria.fin&&
                 nuevo.equals(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio.categoria)){
             VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio=VentanaPrincipal.listaUsuario.seleccion.listacategoria.fin=null;
             JOptionPane.showMessageDialog(null, "Categoria eliminada");
         }else if(nuevo.equals(VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio.categoria)){
             VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio=VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio.siguiente;
             
         }else{
             NodoCategoria anterior,temporal;
             anterior = VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio;
             temporal = VentanaPrincipal.listaUsuario.seleccion.listacategoria.inicio.siguiente;
             while(temporal!=null && !temporal.categoria.equals(nuevo)){
                 anterior=anterior.siguiente;
                 temporal=temporal.siguiente;
             }if(temporal==null){
                 JOptionPane.showMessageDialog(null, "No se encuentra en la lista");
                 
             }
             if(temporal!=null){
                 anterior.siguiente=temporal.siguiente;
                 JOptionPane.showMessageDialog(null, "Categoria eliminada");
                 if(temporal==VentanaPrincipal.listaUsuario.seleccion.listacategoria.fin){
                     VentanaPrincipal.listaUsuario.seleccion.listacategoria.fin=anterior;
                     JOptionPane.showMessageDialog(null, "Categoria eliminada");
                 }
               
             }
             
         }  
         
       }else{
           JOptionPane.showMessageDialog(null, "La lista esta vacia");
       }
    }
}

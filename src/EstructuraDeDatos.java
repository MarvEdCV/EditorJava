/* NO CAMBIE EL CODIGO DE ESTA CLASE */

import java.io.Serializable;



/**
*	Define la estrucutra general en la cual se tienen que comportar las estructuras de datos 
* 	que se implementaran en este proyecto 
* 
*   @author Jorge Daniel Monterroso Nowell - @jorged104
*	@version 1.0
**/

public abstract class EstructuraDeDatos implements Serializable{
    protected String nombre;
    public int index;

    public EstructuraDeDatos() {
        this.index = 0;
    }
    

   public abstract void add(Object e);
  
   public abstract Object peek();
   
   public abstract Object find(Object e);
   
   public abstract Object getNext();
   
   public abstract Object getPrevius();
 
   public abstract int getSize();

   public abstract Object get(int i);
  
   public abstract Object pop();

   public abstract void delete(Object e);
}
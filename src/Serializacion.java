import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Clase utilizada para serializar datos y convertirlos en bits 
 * @author marvi
 */
public class Serializacion implements Serializable {

     /**
      * Metodo constructor para crear un objeto de tio Serializacion 
      */
    public Serializacion() {
    }
    
    /**
     * Metodo utilizado para guardar lo que se esta serializando por medio de la clase java.io que es nativa de JAVA
     */
    public void guardar(){
        try {
            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("DATOS/DATOS.TXT"));
            save.writeObject(VentanaPrincipal.listaUsuario);
            save.close();
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "Error al crear documento ");
        }
    }
    
    /**
     * Metodo utilizado para leer cada vez que se inicializa el programa la lista serializada para recoger los datos ya guardadas anteriormente y si esta esta vacia
     * lanza mensaje de que es la primera vez que se ejecuta
     * @return retorna la lista ya cargada de datos despues de leer los mismos
     */
    public ListaUsuario read() {
        ListaUsuario LIS= new ListaUsuario();
        
        try{
        ObjectInputStream leer = new ObjectInputStream(new FileInputStream("DATOS/DATOS.txt"));
        try{
        LIS=(ListaUsuario)leer.readObject();
        }catch(ClassNotFoundException ex){
           //  JOptionPane.showMessageDialog(null, "Archivo no encontrado, porque es primera vez que se ejecuta el programa");
        }
        }catch(IOException ex){
            // JOptionPane.showMessageDialog(null, "Archivo no encontrado, porque es primera vez que se ejecuta el programa");
        }
        return LIS;
        } 
}

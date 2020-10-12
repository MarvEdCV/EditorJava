
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase creada para realizar copias de JPG de archivos originales JPG
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */
public class JPEGImageCopy extends ImageHandler {
 BufferedImage image;
     File archivoimg;
     String nombretmp;
     
     /**
      * Metodo Constructor para crear objetos y transformarlos 
      * @param filename recibe el nombre de la imagen 
      */

    public JPEGImageCopy(String filename) {
        super(filename);
    }
    
    /**
     * Metodo utilizado para leer el fichero que contiene la imagen solicitada en esta clase 
     * @throws Exception por si no lee el documento
     * @since 1.0.0
     */
    @Override
    public void readFile() throws Exception {
      archivoimg =  new File(VentanaEditor.nombrer);
          image = ImageIO.read(archivoimg);
    }

     /**
     * Metodo utilizado para generar el fichero de formato JPG y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR  tambien
     * crea una copia del documento en extension BMP de la clase BmpHanlderCopy
     * @throws Exception por si no lee el documento
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
        nombretmp = VentanaEditor.nombre+"bmp";
        File temporal = new File("IMAGENES/TEMPORALBMP/"+nombretmp);
        ImageIO.write(image, "bmp",temporal);
        //Creando copia BMP DE la BMP creada con la clase que dio Jorge Nowell
        BmpHandlerCopy copiabmp = new BmpHandlerCopy(VentanaEditor.nombrer);
        copiabmp.readFile();  
        copiabmp.generateFiles();
        ImageIO.write(image, "jpg",new File("IMAGENES/COPIASJPG/Copia-"+VentanaEditor.nombre+"jpg"));
        JOptionPane.showMessageDialog(null, "Copia JPG guardada");
       
    }
    
}

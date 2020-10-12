
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase creada para realizar copias de BMP de archivos originales JPG
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */



public class JPEGtoBMPImage extends ImageHandler {
     BufferedImage image;
     File archivoimg;
     
     /**
      * Metodo Constructor para crear objetos y transformarlos 
      * @param filename recibe el nombre de la imagen 
      */
    public JPEGtoBMPImage(String filename) {
        super(filename);
    }
    
    /**
     * Metodo utilizado para leer el fichero que contiene la imagen solicitada en esta clase 
     * @throws Exception por si se genera algun error al momento de la lectura de la imagen 
     * @since 1.0.0
     */
    @Override
    public void readFile() throws Exception {
       try{
          archivoimg =  new File(VentanaEditor.nombrer);
          image = ImageIO.read(archivoimg);
          
       }catch(Exception e){
       }
    }
    
    /**
     * Metodo utilizado para generar el fichero de formato JPG de una imagen original obtenida en el metodo anterior pero con el cambio de que se transforma 
     * a una extgension BMP
     * y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR 
     * @throws Exception Por si se genera algun error al momento de la generacion de las imagenes nuevvas
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(image, "bmp",new File("IMAGENES/JPGABMP/Converted-"+VentanaEditor.nombre+"bmp"));
        JOptionPane.showMessageDialog(null, "Imagen JPG convertida a BMP guardada");
    }
    
}

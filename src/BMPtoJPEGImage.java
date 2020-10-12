
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase para transformar imagenes de formato BMP a extension JPG o JPEG
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */
public class BMPtoJPEGImage extends ImageHandler {
 BufferedImage image;
     File archivoimg;
     
     /**
      * Metodo Constructor para crear objetos y transformarlos 
      * @param filename recibe el nombre de la imagen 
      */
    public BMPtoJPEGImage(String filename) {
        super(filename);
    }
    /**
     * Metodo utilizado para leer el fichero que contiene la imagen solicitada en esta clase 
     * @throws Exception por si no lee el documento
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
     * Metodo utilizado para generar el fichero de formato JPG y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR 
     * @throws Exception Exception por si no lee el documento
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
      ImageIO.write(image, "jpg",new File("IMAGENES/BMPAJPG/Converted-"+VentanaEditor.nombre+"jpg"));
        JOptionPane.showMessageDialog(null, "Imagen BMP convertida a JPG guardada");
    }
    
}


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 * Clase creada para realizar copias de una imagen y pasarla a blanco y negro
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */




public class JPEGImageHandlerBN extends ImageHandler{
    BufferedImage image;
     File archivoimg;
     /**
      * Metodo Constructor para crear objetos y transformarlos 
      * @param filename recibe el nombre de la imagen 
      */
    public JPEGImageHandlerBN(String filename) {
        super(filename);
    }
    
    /**
     * Metodo utilizado para leer el fichero que contiene la imagen solicitada en esta clase 
     * @throws Exception por si no lee la imagen seleccionada
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
     * a la mimsa imagen pero modificando la tonalidad de sus pixeles a traves de RGB por medio de dos ciclos que recorren completamente la matriz de pixeles 
     * y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR 
     * @throws Exception por si hay error en la generacion de la nueva imagen 
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
       //Obtenemos el ancho y largo de la imagen 
       int ancho = image.getWidth();
       int largo = image.getHeight();
       
       //Convertimos a blanco y negro
       for(int y = 0; y<largo;y++){
           for(int x = 0; x<ancho;x++){
               int p = image.getRGB(x, y);
               
               int a =(p>>24)&0xff;
               int r = (p>>16)&0xff;
               int g=(p>>8)&0xff;
               int b= p&0xff;
               
               int avg = (r+g+b)/3;
              
              p=(a<<24) | (avg<<16) | (avg<<8) |avg;
              image.setRGB(x, y, p);
           }
       }
        ImageIO.write(image, "jpg",new File("IMAGENES/BLANCOYNEGRO/BlancoyNegro-"+VentanaEditor.nombre+"jpg"));
        JOptionPane.showMessageDialog(null, "Imagen convertida a BLANCO Y NEGRO guardadas");   
    }    
       
}


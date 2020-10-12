
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * Clase creada para realizar rotaciones en imagenes de extension JPG, dos rotaciones de 180 grados(sexagesimales) en dos ejes diferentes
 * uno horizontal y otro vertical a travez dee la foto
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */





public class JPEGImageHandlerRotator extends ImageHandler{
BufferedImage image,image1;
     File archivoimg,archivoimg1;
     
     /**
      * Metodo Constructor para crear objetos y transformarlos 
      * @param filename recibe el nombre de la imagen 
      */
    public JPEGImageHandlerRotator(String filename) {
        super(filename);
    }
    
    /**
     * Metodo utilizado para leer el fichero que contiene la imagen solicitada en esta clase 
     * @throws Exception por si hay error al leer la imagen 
     * @since 1.0.0
     */
    @Override
    public void readFile() throws Exception {
       try{
          archivoimg =  new File(VentanaEditor.nombrer);
          image = ImageIO.read(archivoimg);
          
           archivoimg1 =  new File(VentanaEditor.nombrer);
          image1 = ImageIO.read(archivoimg1);
          
       }catch(Exception e){
       }  
    }
    /**
     * Metodo utilizado para generar el fichero de formato JPG de una imagen original obtenida en el metodo anterior, y a travez de dos ciclos que recorren 
     * la matriz de pixeles y por medio de ImageBuffered se manipulan los pixeles para darles vueltas 180 grados n dos diferentes ejes uno vertical y otro horizontal
     * y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR 
     * @throws Exception  por si se genera un error al generar las dos nuevas imagenes rotadas
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
      try{
          int ancho = image.getWidth();
          int largo = image.getHeight();
          for(int i = 0;i<ancho;i++)
          {
              for(int j =0;j<largo/2;j++)
              {
                       int o =  image.getRGB(i, j);
                      image.setRGB(i,j,image.getRGB(i,largo-j-1));
                      image.setRGB(i,largo-j-1,o);
             }
          }
          ImageIO.write(image, "bmp",new File("IMAGENES/ROTARHORIZONTAL/Hrotation-"+VentanaEditor.nombre+"jpg"));
          
          for (int i=0; i < image1.getWidth()/2; i++)
        {
           for (int j=0; j < image1.getHeight(); j++)
           {
               int tmp = image1.getRGB(i, j);
               image1.setRGB(i, j, image1.getRGB(image1.getWidth()-i-1, j));
               image1.setRGB(image1.getWidth()-i-1, j, tmp);
            }
        }

          ImageIO.write(image1, "jpg",new File("IMAGENES/ROTARVERTICAL/Vrotation-"+VentanaEditor.nombre+"jpg"));
          JOptionPane.showMessageDialog(null, "Imagenes ROTADAS guardadas");   
      }catch(Exception e){
          
      }
    }
 

}

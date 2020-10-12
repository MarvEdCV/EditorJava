
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
 * Clase creada para realizar copias de JPG de archivos originales JPG en diferentes colores (rojo,verde,azul y sepia)
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */




public class JPEGImageHandlerColors extends ImageHandler {
    BufferedImage image,image1,image2,image3;
     File archivoimg,archivoimg1,archivoimg2,archivoimg3;
     

    public JPEGImageHandlerColors(String filename) {
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
          
           archivoimg1 =  new File(VentanaEditor.nombrer);
          image1 = ImageIO.read(archivoimg1);
          
          archivoimg2 =  new File(VentanaEditor.nombrer);
          image2 = ImageIO.read(archivoimg2);
          
          archivoimg3 =  new File(VentanaEditor.nombrer);
          image3 = ImageIO.read(archivoimg3);
          
       }catch(Exception e){
       }  
    }
    
    /**
     * Metodo utilizado para generar el fichero de formato JPG de una imagen original obtenida en el metodo anterior pero con el cambio de que se transforma 
     * a la mimsa imagen pero modificando la tonalidad de sus pixeles a traves de RGB por medio de dos ciclos que recorren completamente la matriz de pixeles 
     * y guardarlo en una carpeta ubicada donde se encuentre el ejecutable .JAR 
     * @throws Exception por si hay error en la generacion de las nuevas imagenes 
     * @since 1.0.0
     */
    @Override
    public void generateFiles() throws Exception {
        //Obtenemos el ancho y largo de la imagen 
       int ancho = image.getWidth();
       int largo = image.getHeight();
       
       int ancho1 = image1.getWidth();
       int largo1 = image1.getHeight();
       
       //Convertimos a sepia
       for(int y = 0; y<largo;y++){
           for(int x = 0; x<ancho;x++){
               int p = image.getRGB(x, y);
               
               int a =(p>>24)&0xff;
               int r = (p>>16)&0xff;
               int g=(p>>18)&0xff;
               int b=p&0xff;
               
              //Calculos para cambio de todo del pixel
              int tr = (int)(0.393*r+0.769*g+0.189*b);
              int tg = (int)(0.349*r+0.686*g+0.168*b);
              int tb = (int)(0.272*r+0.534*g+0.131*b);
              
              //Codicionales para pintar los pixeles
              if(tr>255){
                  r=255;
              }else{
                  r=tr;
              }
              if(tg>255){
                  g=255;
              }else{
                  g=tg;
              }
              if(tb>255){
                  b=255;
              }else{
                  b=tb;
              }
              
              //Enviamos nuevo tono de pixel
              p=(a<<24) | (r<<16) | (g<<8) |b;
              image.setRGB(x, y, p);
           }
       }
       ImageIO.write(image, "jpg",new File("IMAGENES/COLORES/Sepia-"+VentanaEditor.nombre+"jpg"));
       
      for(int y = 0; y<largo1;y++){
           for(int x = 0; x<ancho1;x++){
               int p = image1.getRGB(x, y);
               int aa=(p>>16)&0xff;
               int bb=(p>>24)&0xff;
          
               p=(bb<<24)|(aa<<16)|0|0;
               image1.setRGB(x, y, p);
           }
       }
       ImageIO.write(image1, "jpg",new File("IMAGENES/COLORES/Red-"+VentanaEditor.nombre+"jpg"));
       
        for(int y = 0; y<largo1;y++){
           for(int x = 0; x<ancho1;x++){
               int p = image2.getRGB(x, y);
               int aa=(p>>8)&0xff;
               int bb=(p>>24)&0xff;
          
               p=(bb<<24)|(0<<16)|(aa<<8)|0;
               image2.setRGB(x, y, p);
           }
       }
       ImageIO.write(image2, "jpg",new File("IMAGENES/COLORES/Green-"+VentanaEditor.nombre+"jpg"));
       
       for(int y = 0; y<largo1;y++){
           for(int x = 0; x<ancho1;x++){
               int p = image3.getRGB(x, y);
               int aa= p&0xff;
               int bb=(p>>24)&0xff;
          
               p=(bb<<24)|0|0|aa;
               image3.setRGB(x, y, p);
           }
       }
       ImageIO.write(image3, "jpg",new File("IMAGENES/COLORES/Blue-"+VentanaEditor.nombre+"jpg"));
        JOptionPane.showMessageDialog(null, "Imagenes convertidas a ROJO,VERDE,AZUL Y SEPIA guardadas");
    }
}

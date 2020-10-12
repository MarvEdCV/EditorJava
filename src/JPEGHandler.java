
/**
 * Clase utilizada para dejar un regristro de lo que se esta ejecutando a cada momento del programa en la parte del Editor
 * @author marvi
 * @version 1.0.0
 * @since 1.0.0
 */
public class JPEGHandler {
            
	public static void runHandler(ImageHandler imgh) throws Exception {
		/** NO CAMBIE ESTE CODIGO **/
		System.out.println("--------------------------------------");
		System.out.println(imgh.getClass().getTypeName().toUpperCase() + ": ");
		System.out.println("\nLeyendo imagen : " + imgh.getFileName());
		imgh.readFile();
		System.out.println("Proceso de lectura de imagen terminado!");
		System.out.println("\nGenerando imagenes : ");
		imgh.generateFiles();
		System.out.println("Proceso de generacion de archivos terminado!");
		System.out.println("\n--------------------------------------");
		/** --------------------- **/
	}
}
package Interfaz;
import javax.swing.JOptionPane;

/**
 * Clase que crea una ventana para el manejo del usuario
 * @author fabricio
 *@version 1.2 7/4/2015
 */
public class Ventana {
	private String palabra; //Atributo de para la entrada del teclado
	 /**Constructor*/
	 public Ventana(){
	 
	  palabra = JOptionPane.showInputDialog( "Buscar en la web" );//Se crea un nuevo panel
	 
	 }
	 /**Método para retornar la palabra escrita*/
	 public String getPalabra(){
		 return palabra; //Retorna la palabraa
	 }
}	



package Interfaz;
import javax.swing.JOptionPane;


public class Ventana {
	String palabra;
	 
	 public Ventana(){
	 
	  palabra = JOptionPane.showInputDialog( "Buscar en la web" );
	 }
	 public String getPalabra(){
		 return palabra;
		 

	 }
}	



package Main;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Hilo.HiloData;
import Hilo.HiloRecursivity;
import Interfaz.Ventana;

/**
 * 
 * @author Fabricio Miranda y Steven Ortiz
 *Clase principal para el programa
 *@version 1.5 - 1/4/2015
 *
 */
public class XmlMain {
	public static void main(String[] args) throws TagHijoNotFoundException, IOException {
		//HiloData aData = new HiloData();
		//HiloRecursivity aHiloRecursivity = new HiloRecursivity();
		//
	//((ListaEnHilo list = new ListaEnHilo();
	//HiloPrincipal a 
	
		//System.out.println(aToken);
		
		//ParRecursivity aParRecursivity = new ParRecursivity();
		//aParRecursivity.MaxRecursivity();
		
//		System.out.println(aParRecursivity.MaxRecursivity());
//		NewParser aNewParser = new NewParser();
//		aNewParser.Data();
//		System.out.println(aNewParser.Getkeywords());
//		
//		Token aToken = new Token(aNewParser.Getkeywords());
//		System.out.println(aToken.getCantidad());
		Ventana aVentana = new Ventana();
		System.out.println(aVentana.getPalabra());
	}
}
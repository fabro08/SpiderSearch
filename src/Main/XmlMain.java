package Main;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Hilo.ListaEnHilo;
import Parseo.MetaDatos;
import Parseo.ParRecursivity;
import Parseo.Token;

/**
 * 
 * @author Fabricio Miranda y Steven Ortiz
 *Clase principal para el programa
 *@version 1.5 - 1/4/2015
 *
 */
public class XmlMain {
	public static void main(String[] args) throws TagHijoNotFoundException, IOException {
	//ListaEnHilo list = new ListaEnHilo();
		
		//System.out.println(aToken);
		
		ParRecursivity aParRecursivity = new ParRecursivity();
		System.out.println(aParRecursivity.MaxRecursivity());
//		NewParser aNewParser = new NewParser();
//		aNewParser.Data();
//		System.out.println(aNewParser.Getkeywords());
//		
//		Token aToken = new Token(aNewParser.Getkeywords());
//		System.out.println(aToken.getCantidad());
	}
}
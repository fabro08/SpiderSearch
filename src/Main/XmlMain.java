package Main;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Hilo.ListaEnHilo;
import Parseo.NewParser;
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
		NewParser aNewParser = new NewParser();
		aNewParser.Data();
		
		Token aToken = new Token(aNewParser.Getkeywords());
		//System.out.println(aToken);
		
	}
}
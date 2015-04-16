package Parseo;

import java.util.StringTokenizer;

import Listas.Nodo;

/**
 * Clase para el ordenamiento de el String generado por el parser
 * 
 * @author fabricio
 *
 */
public class Token {
	
		
	/**
	 * Constructor
	 * 
	 * @param String
	 */
	StringTokenizer tokens;
	Nodo siguiente;
	String tokena = null;
	
	
	
	public  Token(String name) {
		tokens = new StringTokenizer(name, ",");// Recibe un String y lo separa por comas
				
		
	}
	public void getToken(){
		while (tokens.hasMoreTokens()) {
			 //tokens.nextToken();
			tokens.nextElement();
	}
		
	}
	public Object gg(){
		return tokens.nextElement();
	}
}

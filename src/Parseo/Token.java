package Parseo;

import java.util.StringTokenizer;

/**
 * Clase para el ordenamiento de el String generado por el parser
 * 
 * @author fabricio
 * @version 1.1 - 12/4/2015
 */
public class Token {

	StringTokenizer tokens;// Atributo

	/**
	 * Método para insertar una URL
	 * 
	 * @param name
	 */
	public Token(String name) {
		tokens = new StringTokenizer(name, ",");// Recibe un String y lo separa
												// por comas

	}

	/**
	 * Método para manejar el ciclo
	 * 
	 * @return null;
	 */
	public String CicloToken() {

		while (tokens.hasMoreTokens()) {// Mientras haya tokens

			return tokens.nextToken();// Retorne el token siguiente

		}
		return null;

	}

}

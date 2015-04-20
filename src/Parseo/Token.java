package Parseo;

import java.util.StringTokenizer;

import Listas.Lista_Circular_Enlazada;

/** Clase para el ordenamiento de el String generado por el parser
 * @author fabricio
 * @version 1.1 - 12/4/2015
 */
public class Token {

	private StringTokenizer tokens;// Atributo
	private String  listaMeta="A";
	Lista_Circular_Enlazada lista = new Lista_Circular_Enlazada();	
	

	/**
	 * Método para insertar una URL
	 * @param name
	 */

	public Token(String name) {
		tokens = new StringTokenizer(name, "\\");// Recibe un String y lo separa
											// por comas
	}
	/**
	 * Método para manejar el ciclo
	 */
	public Object  CicloToken() {

		while (true) {// Mientras haya tokens
			if(tokens.hasMoreTokens()){
				return tokens.nextToken();// Retorne el token siguiente
		}
			else{
				break;
	}
		}
		return listaMeta;
	}}

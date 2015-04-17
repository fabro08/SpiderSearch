package Xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.jespxml.JespXML;
import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jespxml.modelo.Tag;
import org.xml.sax.SAXException;

/**
 * Clase para leer el Xml que contiene las configuraciones
 *@author Fabricio Miranda y Steven Ortiz
 *@version 1.1 1-04-15
 *@return max, recur, reind
 */
public class LeerXmlConfig {
	/** Creacion del padre y los hijos*/
	private Tag maxthreads, recursivity, reindex;

	/** Creacion de la lectura de Maxthreads*/
	public String Maxthreads() throws TagHijoNotFoundException {
		/** Lee el arhivo XML */
		JespXML xml = new JespXML("Configuration.xml");

		/** Se establece la variable a retornar.*/
		String max = null;

		try {
			/** Lectura del XML*/
			Tag raiz = xml.leerXML();
			maxthreads = raiz.getTagHijoByName("maxthreads");
			max = maxthreads.getContenido();

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/** Retorno del resultado*/
		return max;

	}

	/** Creacion de la lectura de Recursivity*/
	public String Recursivity() throws TagHijoNotFoundException {
		/** Lee el arhivo XML*/
		JespXML xml = new JespXML("Configuration.xml");

		/** Se establece la variable a retornar.*/
		String recur = null;

		try {
			/** Lectura del XML*/
			Tag raiz = xml.leerXML();
			recursivity = raiz.getTagHijoByName("recursivity");
			recur = recursivity.getContenido();

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/** Retorno del resultado*/
		return recur;
	}

	public String Reindex() throws TagHijoNotFoundException {
		/** Lee el arhivo XML*/
		JespXML xml = new JespXML("Configuration.xml");

		/** Se establece la variable a retornar*/
		String reind = null;

		try {
			/** Lectura del XML*/
			Tag raiz = xml.leerXML();
			reindex = raiz.getTagHijoByName("reindex");
			reind = reindex.getContenido();

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/** Retorno del resultado*/
		return reind;
	}
}

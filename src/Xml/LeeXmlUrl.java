package Xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.jespxml.JespXML;
import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jespxml.modelo.Tag;

import org.xml.sax.SAXException;

/**
 * Clase para leer el Xml que contiene las direcciones URl a acceder
 *@author Fabricio Miranda y Steven Ortiz
 *@version 1.1 1-04-15
 *@return ContenidoURL
 */
public class LeeXmlUrl {
	/*
	 * Creacion del padre y los hijos
	 */
	Tag URL0, URL1, URL2, raiz;

	/*
	 * Creacion de la lectura de URL0
	 */
	public String LeeXmlUrl0() throws TagHijoNotFoundException {
		/*
		 * Lee el arhivo XML
		 */
		JespXML xml = new JespXML("SpiderBot.xml");

		/*
		 * Se establece la variable a retornar.
		 */
		String ContenidoUrl0 = null;

		try {
			/*
			 * Lectura del XML
			 */
			Tag raiz = xml.leerXML();
			URL0 = raiz.getTagHijoByName("URL0");
			ContenidoUrl0 = URL0.getContenido();

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
		/*
		 * Retorno del resultado
		 */
		return ContenidoUrl0;

	}

	/*
	 * Creacion de la lectura de URL1
	 */
	public String LeeXmlUrl1() throws TagHijoNotFoundException {
		/*
		 * Lee el arhivo XML
		 */
		JespXML xml = new JespXML("SpiderBot.xml");

		/*
		 * Se establece la variable a retornar.
		 */
		String ContenidoUrl1 = null;

		try {
			/*
			 * Lectura del XML
			 */
			Tag raiz = xml.leerXML();
			URL1 = raiz.getTagHijoByName("URL1");
			ContenidoUrl1 = URL1.getContenido();

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

		/*
		 * Retorno del resultado
		 */
		return ContenidoUrl1;
	}

	/*
	 * Creacion de la lectura de URL2
	 */
	public String LeeXmlUrl2() throws TagHijoNotFoundException {
		/*
		 * Lee el arhivo XML
		 */
		JespXML xml = new JespXML("SpiderBot.xml");

		/*
		 * Se establece la variable a retornar.
		 */
		String ContenidoUrl2 = null;
		try {
			/*
			 * Lectura del XML
			 */
			Tag raiz = xml.leerXML();
			URL2 = raiz.getTagHijoByName("URl2");
			ContenidoUrl2 = URL2.getContenido();

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
		/*
		 * Retorno del resultado
		 */
		return ContenidoUrl2;
	}
}

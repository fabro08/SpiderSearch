package Xml;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.jespxml.JespXML;
import org.jespxml.modelo.Encoding;
import org.jespxml.modelo.Tag;

/**
 *Clase para crear un Xml que contiene las direcciones URl a acceder
 *@author Fabricio Miranda y Steven Ortiz
 *@version 1.1 1-04-15
 */
public class CrearXmlUrl {

	/**Creacion del padre y los hijos*/
	private Tag raiz = new Tag("Targets");
	private Tag URL0;
	private Tag URL1;
	private Tag URL2;
	
	/** Constructor*/
	public CrearXmlUrl() {
		/** creacion de las etiquetas*/
		URL0 = new Tag("URL0");
		URL1 = new Tag("URL1");
		URL2 = new Tag("URL2");

		/** Creacion del contenido*/
		URL0.addContenido("http://www.javatpoint.com/");
		URL1.addContenido("http://9gag.com/");
		URL2.addContenido("http://www.nacion.com/");

		/** Establecer Hijos*/
		raiz.addTagHijo(URL0);
		raiz.addTagHijo(URL1);
		raiz.addTagHijo(URL2);

		/** Creacion del archivo XML de las URL*/
		JespXML xml = new JespXML(new File("SpiderBot.xml"), Encoding.UTF_8);

		try {
			xml.escribirXML(raiz);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

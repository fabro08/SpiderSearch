package Xml;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.jespxml.JespXML;
import org.jespxml.modelo.Encoding;
import org.jespxml.modelo.Tag;

/**Clase para el manejo de la configuracion
 * @author Fabricio Miranda y Steven Ortiz
 * @version 1.1 1-04-15
 */
public class ConfiguracionXml {
	/*
	 * Tags a usar para la creación del padre y los hijos
	 */
	Tag raiz = new Tag("Spider");
	Tag maxthreads;
	Tag recursivity;
	Tag reindex;
	/*
	 * Constructor
	 */
	public ConfiguracionXml() {
		
		

		/*
		 * Etiquetas
		 */
		maxthreads = new Tag("maxthreads");
		recursivity = new Tag("recursivity");
		reindex = new Tag("reindex");

		/*
		 * Agreagando contenido a los hijos
		 */
		maxthreads.addContenido("10");
		recursivity.addContenido("5");
		reindex.addContenido("8");

		/*
		 * Estableciendo padre e hijos
		 */
		raiz.addTagHijo(maxthreads);
		raiz.addTagHijo(recursivity);
		raiz.addTagHijo(reindex);

		/*
		 * Se genera un archivo XML.
		 */
		JespXML xml = new JespXML(new File("Configuration.xml"), Encoding.UTF_8);

		/*
		 * Se rodea el archivp con excepciones.
		 */
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

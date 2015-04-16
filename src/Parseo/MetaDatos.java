package Parseo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Clase encargada de capturas los datos de una página web
 * @author fabricio
 *@version 1.2 - 10/4/2015
 */
public class MetaDatos {
	 private String Titulos = null; //Atributo del objeto

	public void Data() throws IOException { ///Metodo encargado de conectar la pagina web
		
		Document documento = Jsoup.connect("http://www.nacion.com").get(); //Se crea un documento 

		Titulos = documento.select("meta[name=keywords]").first().attr("content"); //Se extraen los títulos
	}

	public String GetTitulos() {
		return Titulos;
	}

}
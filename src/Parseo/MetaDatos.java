package Parseo;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import Xml.LeeXmlUrl;

/**
 * Clase encargada de capturas los datos de una página web
 * @author fabricio
 *@version 1.2 - 10/4/2015
 */
public class MetaDatos {
	private String Titulos0, Titulos1, Titulos2 = null; //Atributo del objeto
	LeeXmlUrl url0 = new LeeXmlUrl();
	LeeXmlUrl url1 = new LeeXmlUrl();
	LeeXmlUrl url2 = new LeeXmlUrl();
	 
	/**Metodo encargado de conectar la pagina web
	 * @throws TagHijoNotFoundException */ 
	public void Data() throws IOException, TagHijoNotFoundException { 
		
		Document documento0 = Jsoup.connect(url0.LeeXmlUrl0()).get();
		Document documento1 = Jsoup.connect(url0.LeeXmlUrl1()).get();
		Document documento2 = Jsoup.connect(url0.LeeXmlUrl2()).get();//Se crea un documento 

		Titulos0 = documento0.select("meta[name=keywords]").first().attr("content"); //Se extraen los títulos
		Titulos1 = documento1.select("meta[name=keywords]").first().attr("content");
		Titulos2 = documento2.select("meta[name=keywords]").first().attr("content");
	}
	
	/**Metodo para retornar el data*/
	public String GetData0() {
		return Titulos0;
	}
	public String GetData1() {
		return Titulos1;
	}
	public String GetData2() {
		return Titulos2;
	}

}
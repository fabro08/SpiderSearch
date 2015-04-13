package Parseo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import Interfaz.Ventana;

public class NewParser {
	//Ventana bVenta = new Ventana();
	public NewParser() throws IOException{
		Document doc = Jsoup.connect("http://www.nacion.com").get();

		String keywords = doc.select("meta[name=keywords]").get(0).attr("content");
		
		String desciption = doc.select("meta[name=description]").get(0).attr("content");
		
		System.out.println(keywords);
		                                                                                                                                                                                     
			
		
	
		
		
		System.out.println("Meta description : " + desciption);
		
			
		
	}
}
package Parseo;

import java.io.IOException;

import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;

/**Clase para Extraer links*/
public class ParRecursivity {
	
	private Elements links;
	private Elements link;
	private String parar = "parar";
	
	public String Recursivity() throws IOException{
        
		Document doc = Jsoup.connect("http://www.nacion.com").get();  
        links = doc.select("a[href]");  
        for (Element link : links) {  
           return links.attr("href");  
        
        }
 
        return parar;
		
	}
	public Object getMax(){
		return link.attr("href");
	}
}  

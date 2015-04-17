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
	
	public ParRecursivity() throws IOException{
        
		Document doc = Jsoup.connect("http://www.javatpoint.com").get();  
        links = doc.select("a[href]");  
        for (Element link : links) {  
             System.out.println((link.attr("href")));  
        
        }
		//return   links.attr("href");
		
}
	public Object getMax(){
		return link.attr("href");
	}
}  

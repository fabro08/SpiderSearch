package Parseo;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements; 

import Xml.LeerXmlConfig;

public class ParRecursivity {
	LeerXmlConfig veces = new LeerXmlConfig();
	String Variable = null;
	int cantidad = 0;
	Node link;
	String Recur = null;
	public String ParRecursivity() throws IOException, TagHijoNotFoundException {
		
		 Recur = veces.Recursivity();
		int RecurInt = Integer.parseInt(Recur);
		Document doc = Jsoup.connect("http://www.facebook.com").get();
		Elements links = doc.select("a[href]");
		for (Element link : links){
	
			//return(link.attr("href"));
			
			

			
		}
		return (link.attr("href"));
		

	}
	public String getRecir(){
		return Recur;
		
	}


}

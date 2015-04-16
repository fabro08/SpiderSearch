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
	public String MaxRecursivity() throws IOException{
        
		Document doc = Jsoup.connect("http://www.javatpoint.com").get();  
        Elements links = doc.select("a[href]");  
        for (Element link : links) {  
            return  (link.attr("href"));  
        
        }
		return   links.attr("href");
}  
}  

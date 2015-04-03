package Parseo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.jespxml.excepciones.TagHijoNotFoundException;
import Xml.LeeXmlUrl;

/** Clase para parsear una URl
* @author Fabricio Miranda y Steven Ortiz
* @version 1.1 - 31/3/2015
*/	
public class Parseo {
	
	public Parseo() throws TagHijoNotFoundException{
		LeeXmlUrl url0 = new LeeXmlUrl();
	      try {
	         // Se abre la conexión
	         URL url = new URL(url0.LeeXmlUrl2());
	         URLConnection conexion = url.openConnection();
	         conexion.connect();
	         
	         
	         InputStream is = conexion.getInputStream();
	         BufferedReader br = new BufferedReader(new InputStreamReader(is));
	         char[] buffer = new char[1000];
	         int leido;
	         while ((leido = br.read(buffer)) > 0) {
	            System.out.println(new String(buffer, 0, leido));
	         }
	      } catch (MalformedURLException e) {
	         
	         e.printStackTrace();
	      } catch (IOException e) {
	    	  e.printStackTrace();
	      }
	   }
	}



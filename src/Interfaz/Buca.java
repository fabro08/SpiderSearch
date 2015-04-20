package Interfaz;

import java.io.IOException;
import java.net.URISyntaxException;
import org.jespxml.excepciones.TagHijoNotFoundException;

import Xml.LeeXmlUrl;
import Hilo.HiloData;
import Listas.Lista_Circular_Enlazada;
/**
 * Clase para buscar la palabra en el arreglo
 * @author fabricio
 *@version 1.1 19/4/2015
 */
public class Buca {
	/**
	 * Busca
	 * @throws IOException
	 * @throws TagHijoNotFoundException
	 * @throws URISyntaxException
	 */
	public  Buca() throws IOException, TagHijoNotFoundException, URISyntaxException{
	HiloData aDbData = new HiloData();
	//Navegador pagina = new Navegador();
	LeeXmlUrl url = new LeeXmlUrl();
	Ventana ventana = new Ventana();
	
	aDbData.start();
	
	if ( ((Lista_Circular_Enlazada) aDbData.getLista0()).Busca(ventana.getPalabra())==true){
		
		Navegador pagina = new Navegador();
		pagina.Navegado(url.LeeXmlUrl0());	
	}
	else if ( ((Lista_Circular_Enlazada) aDbData.getLista1()).Busca(ventana.getPalabra())==true){
		
		Navegador pagina = new Navegador();
		pagina.Navegado(url.LeeXmlUrl1());
	}
	else if ( ((Lista_Circular_Enlazada) aDbData.getLista2()).Busca(ventana.getPalabra())==true){
		
		Navegador pagina = new Navegador();
		pagina.Navegado(url.LeeXmlUrl2());

}
	}
}


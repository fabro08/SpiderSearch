package Main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Xml.CrearXmlUrl;
import Xml.LeeXmlUrl;
import Xml.LeerXmlConfig;
import Hilo.HiloData;
import Hilo.HiloPrincipal;
import Hilo.HiloRecursivity;
import Interfaz.Navegador;
import Interfaz.Ventana;
import Listas.ListaParseo;
import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.ParRecursivity;
import Parseo.Token;

/**
 * 
 * @author Fabricio Miranda y Steven Ortiz
 *Clase principal para el programa
 *@version 1.5 - 1/4/2015
 *
 */
public class XmlMain {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws TagHijoNotFoundException, IOException, URISyntaxException {
		
		//Metadatos
		//MetaDatos aDatos = new MetaDatos();
		//aDatos.Data();
		//System.out.println(aDatos.GetData());
		
		//ListaParseo listaEspecial =new ListaParseo();
		//Lista_Circular_Enlazada ListasURL =new Lista_Circular_Enlazada();
		//ListasURL.Insertar_Inicio("wwww.google.com");
		//ListasURL.Insertar_Inicio("www.nacion.com");
		//if(ListasURL.Busca("wwww.google.com")==true){
		//	System.out.println("A");
		//}
		//aDatos.Data();	
		//System.out.println(aDatos.GetData());
		//ParRecursivity aParRecursivity = new ParRecursivity();
		//HiloRecursivity hilo = new HiloRecursivity();
		//Token aToken = new Token(aParRecursivity.Recursivity());
		//System.out.println(aToken.CicloToken());
		//Navegador aNavegador = new Navegador();
		
		//ParRecursivity aParRecursivity = new ParRecursivity();
		//System.out.println(aParRecursivity);
//	System.out.println(aParRecursivity.getMax());
		//aParRecursivity.getMax();
		
		//Token
		//Token token = new Token(aDatos.GetData());
		//System.out.println(token.CicloToken());
	//Ventana aVentana= new Ventana();
		//HiloData
		HiloData aDbData = new HiloData();
		aDbData.start();
	//	System.out.println(aDbData.getUrl());
		
		System.out.println(aDbData.getLista0());
		System.out.println(aDbData.getLista1());
		System.out.println(aDbData.getLista2());
		aDbData.compara("a");
		
		//CrearXmlUrl aCrearXmlUrl = new CrearXmlUrl();
		//System.out.println(aVentana.getPalabra());
		
		
	}
}
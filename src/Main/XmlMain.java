package Main;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Interfaz.VentanaPrincipal;
import Listas.Lista_Circular_Enlazada;
import Parseo.Parseo;
import Xml.CrearXmlUrl;
import Xml.LeeXmlUrl;

/**
 * 
 * @author Fabricio Miranda y Steven Ortiz
 *Clase principal para el programa
 *@version 1.5 - 1/4/2015
 *
 */
public class XmlMain {
	public static void main(String[] args) throws TagHijoNotFoundException {
		
		
		/*
		 * Creacion de objetos
		 */
		Parseo parsear = new Parseo();
		
		LeeXmlUrl  url= new LeeXmlUrl();
		url.LeeXmlUrl0();
		url.LeeXmlUrl1();
		url.LeeXmlUrl2();
		
		CrearXmlUrl creaUrl = new CrearXmlUrl();
		
	//*******************************************************
		Lista_Circular_Enlazada Lista= new Lista_Circular_Enlazada();
		Lista.Insertar_Inicio(url.LeeXmlUrl0());
		Lista.Insertar_Inicio(url.LeeXmlUrl1());
		Lista.Insertar_Inicio(url.LeeXmlUrl2());
		

		System.out.println(Lista.Imprimir());
		
		System.out.println(Lista.Busca("http://www.google.com/"));
		
		VentanaPrincipal ventana = new VentanaPrincipal();
		
	
		}
		
	}
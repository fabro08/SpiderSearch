package Hilo;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jespxml.modelo.Tag.Cantidad;

import Xml.LeeXmlUrl;
import Interfaz.Ventana;
import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.Token;

/**
 * Clase para crear un hilo.
 * 
 * @author Fabricio Miranda y Steven Ortiz
 * @version 1.3 - 1/4/2015
 */
class HiloPrincipal extends Thread {
	public HiloPrincipal() {
		start();
	}

}

/**
 * Clase para manejar un hilo con la lista
 * 
 * @author fabricio
 *
 */
public class ListaEnHilo {

	public ListaEnHilo() throws TagHijoNotFoundException, IOException {
		MetaDatos aNewParser = new MetaDatos();
		aNewParser.Data();
		
		Token aToken = new Token(aNewParser.Getkeywords());
		HiloPrincipal hilo = new HiloPrincipal();
		
		
		LeeXmlUrl url = new LeeXmlUrl();
		url.LeeXmlUrl0();
		url.LeeXmlUrl1();
		url.LeeXmlUrl2();
		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada();
		Ventana ventana = new Ventana();
		//Lista.Insertar_Inicio(url.LeeXmlUrl0());
		//Lista.Insertar_Inicio(url.LeeXmlUrl1());
		
		//Lista.Insertar_Inicio(ventana.getPalabra());
		Boolean cantidad = true;
		while (cantidad==true) {
			if(ventana.getPalabra()==aToken.CicloToken()){
				cantidad = false;
			}
			
			
			Lista.Insertar_Inicio(aToken.CicloToken());
		
			System.out.println(Lista.Imprimir());

			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

package Hilo;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Xml.LeeXmlUrl;
import Interfaz.Ventana;
import Listas.Lista_Circular_Enlazada;

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

	public ListaEnHilo() throws TagHijoNotFoundException {
		HiloPrincipal hilo = new HiloPrincipal();
		LeeXmlUrl url = new LeeXmlUrl();
		url.LeeXmlUrl0();
		url.LeeXmlUrl1();
		url.LeeXmlUrl2();
		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada();
		Ventana ventana = new Ventana();

		while (true) {

			// Lista.Insertar_Inicio(url.LeeXmlUrl0());
			// Lista.Insertar_Inicio(url.LeeXmlUrl1());
			// Lista.Insertar_Inicio(url.LeeXmlUrl2());
			Lista.Insertar_Inicio(ventana.getPalabra());

			if (ventana.getPalabra().equals("kim")) {
				System.out.println("Es una peleona");
			} else {
				System.out.println("Es el mejor");
			}
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

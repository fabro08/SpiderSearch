package Hilo;

import java.io.IOException;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.ParRecursivity;

/**
 * Clase para crear un hilo.
 * 
 * @author Fabricio Miranda
 * @version 1.3 - 1/4/2015
 */
public class HiloRecursivity {
	public HiloRecursivity() throws IOException, TagHijoNotFoundException {
		HiloPrincipal hiloData = new HiloPrincipal(); //Se crea el hilo
		hiloData.run();

		//MetaDatos metaData = new MetaDatos(); //Se crea metaData
		//metaData.Data();

		//Token metaToken = new Token(metaData.GetTitulos()); //Se crea el token

		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada(); //Se crea la lista circular
		ParRecursivity aParRecursivity = new ParRecursivity();
		//aParRecursivity.Recursivity();
		
		while (true) {
			
		
			Lista.Insertar_Inicio(aParRecursivity.Recursivity()); //Se crear un elemento en la lista
			System.out.println(Lista.Imprimir()); //

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
	



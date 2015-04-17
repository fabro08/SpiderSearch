package Hilo;

import java.io.IOException;

import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.ParRecursivity;
import Parseo.Token;

/**
 * Clase para crear un hilo.
 * 
 * @author Fabricio Miranda
 * @version 1.3 - 1/4/2015
 */
public class HiloRecursivity {
	public HiloRecursivity() throws IOException {
		HiloPrincipal hiloData = new HiloPrincipal(); //Se crea el hilo
		hiloData.run();

		MetaDatos metaData = new MetaDatos(); //Se crea metaData
		metaData.Data();

		//Token metaToken = new Token(metaData.GetTitulos()); //Se crea el token

		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada(); //Se crea la lista circular
		ParRecursivity aParRecursivity = new ParRecursivity();
		
		while (true) {
		
			Lista.Insertar_Inicio(aParRecursivity.getMax()); //Se crear un elemento en la lista
			System.out.println(Lista.Imprimir()); //

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
	



package Hilo;

import java.io.IOException;

import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.Token;
/**
 * Clase para crear un hilo que maneje el data de las páginas
 * @author fabricio
 *@version 1.2 14/4/2015
 */
public class HiloData extends Thread {
	/**Constructor*/
	public HiloData() throws IOException {
		HiloPrincipal hiloData = new HiloPrincipal();// Se crea el hilo
		hiloData.run();

		MetaDatos metaData = new MetaDatos();// Se crea metaData
		metaData.Data();

		Token metaToken = new Token(metaData.GetData()); //Se crea el Token

		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada();//Se crea una Lista

		while (true) {
		
			Lista.Insertar_Inicio(metaToken.CicloToken()); //Se inserta el dato a la lista
			System.out.println(Lista.Imprimir());

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}

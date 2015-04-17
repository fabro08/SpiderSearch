package Hilo;

import java.io.IOException;

import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.Token;

public class HiloData extends Thread {

	public HiloData() throws IOException {
		HiloPrincipal hiloData = new HiloPrincipal();// Se crea el hilo
		hiloData.run();

		MetaDatos metaData = new MetaDatos();// Se crea metaData
		metaData.Data();

		Token metaToken = new Token(metaData.GetTitulos());

		Lista_Circular_Enlazada Lista = new Lista_Circular_Enlazada();

		while (true) {
		
			Lista.Insertar_Inicio(metaToken.CicloToken());
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

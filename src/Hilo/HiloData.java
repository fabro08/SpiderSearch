package Hilo;

import java.io.IOException;
import java.util.PrimitiveIterator.OfDouble;

import org.jespxml.excepciones.TagHijoNotFoundException;

import Listas.Lista_Circular_Enlazada;
import Parseo.MetaDatos;
import Parseo.Token;
import Xml.LeeXmlUrl;

/**
 * Clase para crear un hilo que maneje el data de las páginas
 * 
 * @author fabricio
 * @version 1.2 14/4/2015
 */
public class HiloData extends Thread {
	HiloPrincipal hiloData = new HiloPrincipal();// Se crea el hilo

	Lista_Circular_Enlazada lista0 = new Lista_Circular_Enlazada();// Se crea una lista
	Lista_Circular_Enlazada lista1 = new Lista_Circular_Enlazada();//
	Lista_Circular_Enlazada lista2 = new Lista_Circular_Enlazada();//
	
	LeeXmlUrl url = new LeeXmlUrl();

																

	/**
	 * Constructor
	 * 
	 * @throws TagHijoNotFoundException
	 */
	public HiloData() throws IOException, TagHijoNotFoundException {

		hiloData.run();

		MetaDatos metaData0 = new MetaDatos();// Se crea metaData
		MetaDatos metaData1 = new MetaDatos();
		MetaDatos metaData2 = new MetaDatos();
		
		metaData0.Data();
		metaData1.Data();
		metaData2.Data();
		
		Token metaToken0 = new Token(metaData0.GetData0()); // Se crea el Token
		Token metaToken1 = new Token(metaData1.GetData1());
		Token metaToken2 = new Token(metaData2.GetData2());
		
		
		while (true) {
			
			
			lista0.Insertar_Inicio(metaToken0.CicloToken());
			lista1.Insertar_Inicio(metaToken1.CicloToken());
			lista2.Insertar_Inicio(metaToken2.CicloToken());

			if ((metaToken0.CicloToken() == "A")||(metaToken1.CicloToken()=="A")||(metaToken2.CicloToken()=="A")) {
				break;
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	public void compara(String f){
		if (lista0.Busca(f)==true){
			System.out.println("A");
		}
	}
	public Object getLista0() {
		return lista0.Imprimir();

	}
	public Object getLista1() {
		return lista1.Imprimir();

	}
	public Object getLista2() {
		return lista2.Imprimir();

}
	
		
	
	
	public String getUrl() throws TagHijoNotFoundException{
		return url.LeeXmlUrl2();
		
	} 
	
}



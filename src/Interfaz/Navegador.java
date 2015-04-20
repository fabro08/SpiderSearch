package Interfaz;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Clase para abrir el navegador
 * @author fabricio
 *
 */
public class Navegador {
	
	/**
	 * Metodo para que recibe una url
	 * @param url
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public Object Navegado(Object url)throws IOException, URISyntaxException {
	
		  Desktop.getDesktop().browse(new URI((String) url));
		return null;
		
		
		
	
	}

}
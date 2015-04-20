package Interfaz;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Navegador {
	
	public Navegador()throws IOException, URISyntaxException {
	
		Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
		
	
	}

}
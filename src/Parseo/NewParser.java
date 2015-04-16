package Parseo;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import org.jespxml.modelo.Tag.Cantidad;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.lang.model.element.VariableElement;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import Interfaz.Ventana;

/**
 * 
 * @author fabricio
 *
 */
public class NewParser {
	 String Titulos = null;

	public void Data() throws IOException {
		Document documento = Jsoup.connect("http://www.nacion.com").get();

		Titulos = documento.select("meta[name=keywords]").first().attr("content");
	}

	public String Getkeywords() {
		return Titulos;
	}

}
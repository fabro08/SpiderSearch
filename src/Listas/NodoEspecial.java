package Listas;


public class NodoEspecial {
	Object URL;
	Object Metadatos;
	NodoEspecial siguiente;
	
	public NodoEspecial(Object URL, Object Metadatos){
		this.URL=URL;
		this.Metadatos=Metadatos;
		this.siguiente=null;
	}
	public Object getURL() {
		return URL;
	}
	public void setURL(Object uRL) {
		URL = uRL;
	}
	public Object getMetadatos() {
		return Metadatos;
	}
	public void setMetadatos(Object metadatos) {
		Metadatos = metadatos;
	}
	public NodoEspecial getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoEspecial siguiente) {
		this.siguiente = siguiente;
	}

	


}

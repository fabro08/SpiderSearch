package Listas;

/**
 * Classe Nodo para la lista circular doble enlazada
 * @author Fabricio Miranda Leiton & Steven Ortiz Alvarez
 * @version 1.2 - 1/4/2015
 */
public class Nodo {
	Object dato;
	Nodo siguiente;
	Nodo anterior;
	
	/**
	 * Se inicializan los datos y los marcadores
	 * @param dato (recibe un dato)
	 */
	
	public Nodo(Object dato){
		this.dato=dato;
		this.siguiente=null;
		this.anterior=null;
	}
	
	/**
	 * Constructor clase nodo
	 */
	
	public Nodo() {
	}
	
	/**
	 * Metodo que obtiene el dato
	 * @return (devuelve el dato)
	 */
	
	public Object obtenerValor(){
		return dato;
	}
	
	/**
	 * Metodo enlaza el siguiente dato
	 * @param n (dato a enlazar
	 */
	
	public void enlazarSiguiente(Nodo n){
		siguiente=n;
	}
	
	/**
	 * Metodo Obtiene el dato sigueinte
	 * @return (devuelve el dato siguiente
	 */
	
	public Nodo obtenerSiguiente(){
		return siguiente;
	}
}
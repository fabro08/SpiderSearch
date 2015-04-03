package Listas;

import java.util.ArrayList;

/**
 * Esta Clase es un serie de metodos para crear,modificar una lista circular doble enlazada
 * @author Fabricio Miranda Leiton & Steven Ortiz Alvarez
 * @version 1.5 - 1/4/2015
 */



public class Lista_Circular_Enlazada {
	Nodo inicio = null;
	Nodo ultimo=null;
	
	/**
	 * Metodo para insertar un elemento al inicio de la lista
	 * @param ele (Elemento a insertar)
	 */
	public void Insertar_Inicio(Object ele){
		//Agrega con la lista vacia
		if (inicio== null){
			Nodo nuevo= new Nodo (ele);
			inicio=nuevo;
			ultimo=nuevo;
			nuevo.anterior=nuevo;
			nuevo.siguiente=nuevo;
		}
		//Agrega si la lista no es vacia
		else{
			Nodo nuevo=new Nodo(ele);
			ultimo.siguiente=nuevo;
			nuevo.anterior=ultimo;
			inicio.anterior=nuevo;
			nuevo.siguiente=inicio;
			ultimo=nuevo;
		}
		return;
	
	}
	
	/**
	 * Metodo que verifica que la lista no sea vacia
	 * @return (devuelve True o False)
	 */
	public boolean Lista_Vacia(){
		if (inicio==null){
			return true;
		}
		else {
			return false;
		}
	}

    /**
     * Metodo que cuenta la cantidad de elemetos de la lista
     * @return (candidad de elementos de la lista
     */
    public int Cuenta_Lista (){
    	// declara la variable que llevara la cuenta 
        int cantidad = 0;
        if (!Lista_Vacia()) {
            Nodo recorrido=inicio;
            do {
                cantidad++;
                recorrido = recorrido.siguiente;                
            } while (recorrido!=inicio);
        }    
        return cantidad;
    }
    
    /**
     * Metodo de arreglo de lista para imprimir la lista
     * @return (una lista con todos los elementos)
     */
    
    public Object Imprimir(){
    	int ini=1;
    	ArrayList<Object> Lista=new ArrayList<Object>();
    	Nodo elemento=inicio;
    	while (ini <= Cuenta_Lista()){
    		ini++;
    		elemento=elemento.siguiente;
    		Lista.add(elemento.dato);
    	}
    	return Lista;
    }
    
    /**
     * Metodo para buscar un dato en la lista
     * @param ele (dato a buscar)
     * @return (true o false)
     */
    public boolean Busca(Object ele){
    	Nodo recorrido=inicio;
        while ((recorrido.siguiente!=inicio)&&(!(recorrido.obtenerValor().equals(ele)))) {
           recorrido=recorrido.obtenerSiguiente();
           
        }
        return recorrido.obtenerValor().equals(ele);
    }
}
package Listas;

import java.util.ArrayList;
/**
 * Esta Clase es un serie de metodos para crear,modificar una lista circular doble enlazada
 * @author Fabricio Miranda Leiton & Steven Ortiz Alvarez
 * @version 1.5 - 1/4/2015
 */
public class Lista_Doble_Enlazada {
	Nodo inicio = null;
	Nodo ultimo=null;
	
	public void Insertar(Object ele) {
		 if(Lista_Vacia()){
			 Nodo nuevo=new Nodo(ele);
	         inicio=nuevo;
	         ultimo=nuevo;
	         }
		 else{
			 Nodo nuevo=new Nodo(ele);
	         ultimo.siguiente=nuevo;
	         nuevo.anterior=ultimo;
	         ultimo=nuevo;
	         }
		 return;
	}
	public boolean Lista_Vacia(){
		if (inicio==null){
			return true;
		}
		else {
			return false;
		}
	}
	public int Cuenta_Lista(){
    	// declara la variable que llevara la cuenta 
        int cantidad = 0;
        Nodo recorrido=inicio;
    	   while (recorrido!=ultimo){
    		   cantidad++;
    		   recorrido = recorrido.siguiente;                
    	   }    
    	   return cantidad+1;
    }
	public Object Imprimir(){
    	int ini=1;
    	ArrayList<Object> Lista=new ArrayList<Object>();
    	Nodo elemento=inicio;
    	while (ini <= Cuenta_Lista()){
    		ini++;
    		Lista.add(elemento.dato);
    		elemento=elemento.siguiente;
    	}
    	return Lista;
	}
	public boolean Busca(Object ele){
		int ini=1;
    	Nodo recorrido=inicio;
    	while (ini <= Cuenta_Lista()){
    		if (recorrido.dato==ele){
    			return true;
    		}
    		else {
    			ini++;
        		recorrido=recorrido.siguiente;
			}
    	}
    	return false;
	}
}
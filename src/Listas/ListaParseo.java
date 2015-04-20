package Listas;

import Listas.NodoEspecial;

public class ListaParseo {

	public NodoEspecial inicio;
	public NodoEspecial ultimo;
	public int largo;
	
	public ListaParseo() {
		this.inicio=null;
		this.ultimo=null;
		this.largo=0;
		
	}
	
	
	
	public NodoEspecial getInicio() {
		return inicio;
	}



	public void setInicio(NodoEspecial inicio) {
		this.inicio = inicio;
	}



	public NodoEspecial getUltimo() {
		return ultimo;
	}



	public void setUltimo(NodoEspecial ultimo) {
		this.ultimo = ultimo;
	}



	public boolean Lista_Vacia() {
		if (inicio==null){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Insertar(Object URL , Object Metedatos){
		NodoEspecial nuevo=new NodoEspecial(URL ,Metedatos);
		if (Lista_Vacia()){
			inicio=nuevo;
			ultimo=nuevo;
			nuevo.siguiente=null;
		}
		else {
			nuevo.siguiente=null;
			ultimo.siguiente=nuevo;
			ultimo=nuevo;
		}
		this.largo++;
	}
	
	public boolean Buscar(Object dato){
		NodoEspecial Aux = getInicio();
		while (Aux!=null){
			if (dato.equals(Aux.getMetadatos()))
				return true;
			Aux=Aux.getSiguiente();
			
		}
		return false;
	}
	public void Borrar(Object dato){
		NodoEspecial Aux= getInicio();
		if(Aux.siguiente.siguiente!=null){
			while(dato!=Aux.siguiente.getMetadatos()){
				
			}
		}

		
	}
	
	public void Mostrar(){
		NodoEspecial Aux = getInicio();
		while (Aux !=null){
			System.out.println("Dato: "+Aux.getMetadatos());
			Aux=Aux.getSiguiente();
		}
		
	}
	
	public int contador(){
		int contador =0;
		NodoEspecial Aux=getInicio();
		while (Aux!=null){
			contador++;
			Aux=Aux.getSiguiente();
		}
		return contador;
		
	}
	public int apariciones(Object dato){
		int contador1 =0;
		NodoEspecial Aux=getInicio();
		while (Aux!=null){
			if (dato.equals(Aux.getMetadatos())){
				contador1++;
				Aux=Aux.getSiguiente();
			}
			else {
				Aux=Aux.getSiguiente();
			}
		}
		return contador1;
		
	}
	


}

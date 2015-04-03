package Interfaz;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

/** Clase para crear una ventana
* @author Fabricio Miranda y Steven Ortiz
* @version 1.1 - 30/3/2015
*/	
	
public class VentanaPrincipal extends JFrame {

	    public VentanaPrincipal(){
	        setTitle("Spider Search");

	        setBounds(300,100,300,300);
	        
	        setVisible(true);
	        setLayout(new FlowLayout());
	        
	        AccionBoton botonBuscar = new AccionBoton();
	        botonBuscar.addActionListener(botonBuscar);
	        add(botonBuscar);
	        
	        

	       
	    }

	    
}




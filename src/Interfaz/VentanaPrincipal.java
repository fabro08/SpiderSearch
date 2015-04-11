package Interfaz;

import java.awt.FlowLayout;

import javax.swing.*;

/** Clase para crear una ventana
* @author Fabricio Miranda y Steven Ortiz
* @version 1.1 - 30/3/2015
*/	
	
public class VentanaPrincipal extends JFrame {
		JTextField cajaDeTexto = new JTextField();

	    public VentanaPrincipal(){
	        setTitle("Spider Search");

	        setBounds(300,100,640,500);
	        setResizable(true);
	        setVisible(true);
	        setLayout(new  FlowLayout(0,5,0));
	        
	        
	        cajaDeTexto.setText("sfjh");
	        cajaDeTexto.setBounds(90, 60, 90, 23); 
	        
	        AccionBoton botonBuscar = new AccionBoton();
	        botonBuscar.addActionListener(botonBuscar);
	        add(cajaDeTexto);
	        add(botonBuscar); 
	        System.out.println(String(cajaDeTexto));
	    }
	    public String  getCaja() {
	    	return String(cajaDeTexto);
			
		}
		private String String(JTextField cajaDeTexto2) {
			// TODO Auto-generated method stub
			return null;
		}

	    
}




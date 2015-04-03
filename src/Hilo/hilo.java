package Hilo;

/** Clase para crear un hilo.
* @author Fabricio Miranda y Steven Ortiz
* @version 1.3	- 1/4/2015
*/	
public class hilo {

	public static void main(String[] args) {
		mythread tea = new mythread();
		while (true){
			System.out.println("funcion princpiap");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
class mythread extends Thread{
	public mythread() {
		start();
	}
	public void run(){
		while(true){
			System.out.println("aaa");
			try {
				Thread.sleep(3333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

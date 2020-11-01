/*programa que simula el funcionamiento de un semaforo
si esta en verde te dice passa!
si esta en amarillo te dice corre!
si esta en rojo espera
y sino el semaforo ves a l'oculista*/

import java.util.Scanner;

public class Semafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Color?");
		String color=e.nextLine();
		
		if(color.equalsIgnoreCase("vermell")){
			System.out.println("espera");
		}else if(color.equalsIgnoreCase("verd")){
			System.out.println("passa");
		}else if(color.equalsIgnoreCase("groc")){
			System.out.println("corre!");
		}else{
			System.out.println("ves a l'oculista");
		}
		

	}

}

package m3_moises;

import java.util.Scanner;

public class Semaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Introduce un color: ");
		String color=e.nextLine();
		
		if(color.equalsIgnoreCase("rojo")){
			System.out.println("No pases ");
		}else if(color.equalsIgnoreCase("verde")){
			System.out.println("Avanza ");
		}else if(color.equalsIgnoreCase("Amarillo")){
			System.out.println("Precaucion ");
		}else{
			System.out.println("Semaforo en mantenimiento");
		}
		

	}

}

/*Este programa es una version distinta del anterior aunque similar en funcionamiento en este caso utilizaremos un switch.
que nos permitirá evaluar el dato introducido y asi ejecutar un caso u otro
ejemplo: Dia=1-----> salida=dilluns*/


import java.util.Scanner;

public class DiaSetmana {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia=Integer.parseInt(args[0]);
		
		switch (dia) {
		  case 1:
		    System.out.println("Dilluns");
		    break;
		  case 2:
		    System.out.println("Dimarts");
		    break;
		  case 3:
		    System.out.println("Dimecres");
		    break;
		  case 4:
		    System.out.println("Dijous");
		    break;
		  case 5:
		    System.out.println("Divendres");
		    break;
		  case 6:
		    System.out.println("Dissabte");
		    break;
		  case 7:
		    System.out.println("Diumenge");
		    break;
		  default:
			System.out.println("Error");  
		}
	}
}

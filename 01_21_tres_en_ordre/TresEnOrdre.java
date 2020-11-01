/*programa que recibe tres numeros ordenados o desordenados segun el usuario 
considere a su gusto.
el programa ejecuta todas las posibles condiciones para que los tres numeros dados salgan ordenados de menor a mayor*/
import java.util.Scanner;

public class TresEnOrdre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor,medio,menor;
		System.out.println("Primer?");
		int primero=Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int segundo=Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int tercero=Integer.parseInt(Entrada.readLine());
	   if(primero > segundo && primero > tercero){
		   mayor=primero;
	   }else if(segundo>primero && segundo > tercero){
		   mayor=segundo;
	   }else{
		   mayor=tercero;
	   }
			
	   
	   if(primero<segundo && primero<tercero){
		   menor=primero;
	   }else if(segundo<primero && segundo<tercero){
		   menor=segundo;
	   }else{
		   menor=tercero;
	   }
		   
	   medio=(primero+segundo+tercero)-(mayor+menor);
		System.out.print(menor +","+" " + medio + " i " + mayor);
		
		
	}

}

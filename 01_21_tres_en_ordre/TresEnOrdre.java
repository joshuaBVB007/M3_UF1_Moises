
import java.util.Scanner;
public class TresEnOrdre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner e=new Scanner(System.in);
	System.out.println("Primer?");
	int primero1=e.nextInt();

	Scanner et=new Scanner(System.in);
	System.out.println("Segon?");
	int segundo2=et.nextInt();

	Scanner ets=new Scanner(System.in);
	System.out.println("Tercer?");
	int tercero=ets.nextInt();
		
       if(primero1 >= segundo2){
    	   /*si primero no es mayor que el segundo damos
    	   por hecho que primero es inferior a segundo
    	   que nos queda? validar el segundo y tercero*/
			int intercambio = primero1; 
			primero1 = segundo2; 
			segundo2 = intercambio; 			
		}
	else if(primero1<=segundo2){
		int intercambio=primero1;
		segundo2=intercambio;
		primero1=segundo2;
	}else if(segundo2 >= tercero){
			/*
			 * si hemos llegado a este punto es porque el primero no superó 
			 * al segundo entoces si segundo no es mayor que tres 
			 * los numeros estan ordenados
			 */
			int intercambio = segundo2;
			segundo2 = tercero;
			tercero = intercambio;
		}
		System.out.print(primero1 + "," +" "+ segundo2 + " i " + tercero);
		
		
	}

}

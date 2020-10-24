package m3_moises;

import java.util.Scanner;

public class Numero_Hijos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Introduce el numero de hijos que tienes: ");
		int numero=e.nextInt();
		
		if(numero<0){
			System.out.println("No puedes tener menos de cero hijo");
		}else if(numero==0){
			System.out.println("Lo que te has ahorrado en pañales");
		}else if(numero==1){
			System.out.println("No lo mimes mucho");
		}else if(numero>1 && numero <=5){
			System.out.println("No te aburres en casa eh?");
		}else if(numero>5){
			//le hice una pequeña variacion a las condiciones perdon XD
			System.out.println("Tu si que haces pais");
		}
		
		
		
	}

}

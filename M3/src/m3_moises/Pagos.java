package m3_moises;

import java.util.Scanner;

public class Pagos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Introduce lo que pagas: ");
		int i=e.nextInt();
		
		Scanner et=new Scanner(System.in);
		System.out.println("Introduce lo que vale: ");
		int in=et.nextInt();
		
		int resultado=i-in;
		
		if(resultado>1){
			System.out.println("su cambio es :"+resultado+"€");
		}else if(resultado==0){
			System.out.println("No debe nada");
		}else{
			System.out.println("Le faltan "+resultado+"€");
		}
		
		
		
		

	}

}

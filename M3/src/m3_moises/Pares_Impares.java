package m3_moises;

import java.util.Scanner;

public class Pares_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero=e.nextInt();
		
		int residuo=numero%2;
		
		if(residuo==1){
			System.out.println("Es un numero inpar");
		}else{
			System.out.println("es numero par");
		}
		
		
		
	}

}

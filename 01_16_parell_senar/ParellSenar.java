/*programa que examina que el numero recibido es par o inpar ejecutandole una resta de todos los 2 que caben en ese numero.
si el valor retornado es un 1 ese numero es inpar caso contrario es par*/

import java.util.Scanner;

public class ParellSenar {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Integer.parseInt(args[0]);
		
		int residuo=numero%2;
		
		if(residuo==1){
			System.out.println("El número "+numero+" és senar");
		}else{
			System.out.println("El número "+numero+" és parell");
		}	
	}
}

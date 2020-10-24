package m3_moises;

import java.util.Scanner;

public class Prision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=e.nextLine();
		
		Scanner et=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=et.nextInt();
		
		
		if(edad>=18){
			System.out.println("Ya puedes ir a prision! ");
		}else{
			System.out.println("Ve con cuidado! "+nombre);
		}
		
		

	}

}

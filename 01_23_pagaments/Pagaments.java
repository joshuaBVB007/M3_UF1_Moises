package ifs;

import java.util.Scanner;

public class Pagaments {

	/*programa que brinda resultado de transactiones del usuario*/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Preu?");
		int i=Integer.parseInt(Entrada.readLine());

		System.out.println("Paga?");
		int in=Integer.parseInt(Entrada.readLine());
		
		int resultado=i-in;
		
		if(resultado>1){
			System.out.println("Sobren"+resultado+"¤");
		}else if(resultado==0){
			System.out.println("No sobra ni falta res");
		}else{
			System.out.println("Falten "+resultado+"¤");
		}
		
		
		
		

	}

}

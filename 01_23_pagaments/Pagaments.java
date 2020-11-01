/*programa que pregunta al usuario el precio de producto y la cantidad que pago y le informa si le sobran o le falta dinero para completar su compra
si no le falta ni le sobran le dira que no falta nada*/	
import java.util.Scanner;

public class Pagaments {


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

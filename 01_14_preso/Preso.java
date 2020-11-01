/*programa que recibe un nombre y una edad de una persona
y segun esos datos valide si puede ir a prision o debe ir con cuidado*/
import java.util.Scanner;
public class Preso{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner e=new Scanner(System.in);
		System.out.println("Com us dieu?");
		String nombre=Entrada.readLine();
		
		//Scanner et=new Scanner(System.in);
		System.out.println("Quants anys teniu?");
		int edad=Integer.parseInt(Entrada.readLine());
		
		
		if(edad>=18){
			System.out.println("Vos ja podeu anar a la presó!");
			System.out.println("Aneu amb compte "+nombre);
		}else{
			System.out.println("Aneu amb compte "+nombre);
		}
		
		

	}

}

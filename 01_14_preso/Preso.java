import java.util.Scanner;
public class Preso{

	/*programa que valida edades de personas*/

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

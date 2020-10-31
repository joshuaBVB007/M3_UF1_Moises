import java.util.Scanner;

public class ParellSenar {

	/*programa que valida que un numero es par o inpar*/

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

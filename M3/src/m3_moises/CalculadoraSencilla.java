package m3_moises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraSencilla {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		int primero=Integer.parseInt(t.readLine());
		
		System.out.println("Introduce un operador *,-,* o /");
		String operando=t.readLine();
		
		System.out.println("Introduce un numero: ");
		int segundo=Integer.parseInt(t.readLine());
		
		
		if(operando.equals("+")){
			System.out.println((primero+segundo));
		}else if(operando.equals("-")){
			System.out.println(primero-segundo);
		}else if(operando.equals("*")){
			System.out.println(primero*segundo);
		}else{
			try {
				System.out.println(primero/segundo);
			} catch (Exception e) {
				System.out.println(0);
			}
		}
		
		
	}
}

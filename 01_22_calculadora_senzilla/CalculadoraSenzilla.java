/*programa que simula las operaciones matematicas de una calculadora
recibe 2 valores enteros mas uno de tipo string que corresponde a la operacion solicitada (*+-/) y nos devuleve su resultado.
si es usuario intenta una division por cero le informa que no se permite la division por cero.
si el usuario introduce una operacion indebida el programa le dira que el operador no esta disponible */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraSenzilla {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Operand1?");
		Double primero=Double.parseDouble(Entrada.readLine());
		
		System.out.println("Operador?");
		String operando=Entrada.readLine();
		
		System.out.println("Operand2?");
		Double segundo=Double.parseDouble(Entrada.readLine());
		
		double resultado;
		if(operando.equals("+")){
		resultado=primero+segundo;
		System.out.println((primero+" + "+segundo+" = "+resultado));
		}else if(operando.equals("-")){
		resultado=primero-segundo;
		System.out.println((primero+" - "+segundo+" = "+resultado));
		}else if(operando.equals("*")){
		resultado=primero*segundo;
		System.out.println((primero+" * "+segundo+" = "+resultado));
		}else if(operando.equals("/")){

		if(segundo==0){
			System.out.println(("No es pot dividir entre 0"));	
		}else{
		resultado=primero/segundo;
		System.out.println((primero+" / "+segundo+" = "+resultado));
		}
			
		}else{
			System.out.println("L'operador "+operando+" no està disponible");
		}

		
		
	}
}

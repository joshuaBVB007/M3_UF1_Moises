/*programa que valida que los valores introducidos por el usuario son pares o
inpares.
sumara todos los numeros pares introducidos y nos informara cuantos pares hemos
ingresado cuando el usuario introduzca un valor inferior a 0 terminando de 
esa manera el programa*/
public class ComptaParells{
	public static void main(String[] args){
	int suma_pares=0;

	while(true){
		System.out.println("Introdueix un valor");
		int numero=Integer.parseInt(Entrada.readLine());

		if(numero<0){
		  break;
		}
		int validador=numero%2;	
		if(validador==0){
		  suma_pares++;
		}
	}
	System.out.println("Parells introduïts: "+suma_pares);



	}
}

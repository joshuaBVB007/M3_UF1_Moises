/*El funcionamiento de este programa es el siguiente recibes un numero introducido por el usuario y luego este valor se muestra duplicado es decir

ej: introduces 5 salida 10


en esto consiste en el ejercicio
*/

public class Duplica{
	public static void main(String[] args){
        
	int numero=Integer.parseInt(args[0]);

	int num2=numero;

	System.out.println("El doble de "+numero+" és "+(numero+num2));

 }
}

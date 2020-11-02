public class SumaNotes{
	public static void main(String[] args){
	
	int suma=0;

	while(true){
		System.out.println("Introdueix una nota");
		int numero=Integer.parseInt(Entrada.readLine());
		if(numero>100 || numero<0){
			break;
		}

		suma+=numero;
	}
	System.out.println("La suma de les notes vàlides és "+suma);
 }
}

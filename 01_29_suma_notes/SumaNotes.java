/*este programa suma todas los valores introducidos por el usuario
siempre y cuando no esten esos valores por debajo del cero ni por encima de 100
es decir valores inferiores a cero no seran admitidos como tampoco superiores a
100
el programa terminara si se ingresan valores valores de este tipo*/

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

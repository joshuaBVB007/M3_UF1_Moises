/*este programa demanda numeros hasta que el usuario introduzca un numero superior a 100.
una vez el usuario haya introducido un numero superior a 100 nos dara la media
estas son todas las opciones*/

public class NotaMitja{
	public static void main(String[] args){
	int suma=0;
	int ingresos=0;
	while(true){

		System.out.println("Introdueix una nota");
		int numero=Integer.parseInt(Entrada.readLine());
		
		if(numero<0 && ingresos==0){
			break;
		}else if(numero>100){
			break;
		}else if(numero<0){
			break;
		}else{
			suma+=numero;
			ingresos++;
		}
		
        }
	try{
	System.out.println("La mitja de les notes vàlides és "+suma/ingresos);
	}catch(Exception e){
	System.out.println("Cap nota vàlida introduïda");
	}
 }
}

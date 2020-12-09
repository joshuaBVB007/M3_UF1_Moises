/*El funcionamiento de este programa es el siguiente.
recibimos un numero por teclado si lo ingresado es una cadena vacia el programa 
se cancela y te envia lo siguiente "Cancel·lat" para las otras opciones 
las salidas son:

ej: 
entrada=110 salida "fora de rang"
entrada=cinc salida "Nomes nombres"
entrada=0 salida "fora de rang"
entrada=42 salida "encertat!"

entonces nuestro programa es basicamente de validacion de ingresos por teclado 
hasta que se ingrese el numero 42 o se introduzca una cadena vacia.

*/ 


public class Endevina{
	public static void main(String[] args){


	while(true){
		System.out.println("Nombre?");
		String dato=Entrada.readLine();		

		if(dato.isEmpty()){
			System.out.print("Cancel·lat!");
			break;
		}	

		try{
		int receptor=Integer.parseInt(dato);

		if(receptor>100){
			System.out.println("Fora de rang");
		}else if(receptor<1){
			System.out.println("Fora de rang");
		}else if(receptor>0 && receptor<42){
			System.out.println("Massa petit");
		}else if(receptor>42 && receptor<100){
			System.out.println("Massa gran");
		}else if(receptor==42){
			System.out.println("Encertat!");
			break;
		}

		}catch(Exception e){
			System.out.println("Només nombres");
		}
		
		


	}
	
		
	
	
  }
}

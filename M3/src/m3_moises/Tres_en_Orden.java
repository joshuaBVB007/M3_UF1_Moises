package m3_moises;

public class Tres_en_Orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primero1=10;
		int segundo2=8;
		int tercero=12;
		
       if(primero1 >= segundo2){
    	   /*si primero no es mayor que el segundo damos
    	   por hecho que primero es inferior a segundo
    	   que nos queda? validar el segundo y tercero*/
			int intercambio = primero1;
			primero1 = segundo2;
			segundo2 = intercambio;			
		}
		if(segundo2 >= tercero){
			/*
			 * si hemos llegado a este punto es porque el primero no superó 
			 * al segundo entoces si segundo no es mayor que tres 
			 * los numeros estan ordenados
			 */
			int intercambio = segundo2;
			segundo2 = tercero;
			tercero = intercambio;
		}
		System.out.print(primero1 + " " + segundo2 + " " + tercero);
		
		
	}

}

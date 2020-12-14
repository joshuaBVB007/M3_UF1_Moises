/*Este programa recibe palabras introducidas de parte del usuario
y nos hace un "El lloro diu"+la palabra introducida


ejemplo entrada hola salida "El lloro diu" hola

*/

public class Lloro{
	public static void main(String[] args){

	
	while(true){
	System.out.println("El lloro pregunta paraula:");
	String paraula=Entrada.readLine();

		if(paraula.isEmpty()){
			System.out.println("Adéu");
			break;
		}else if(paraula.equals(" ")){
			System.out.println("Adéu");
			break;
		}else{
			System.out.println("El lloro diu: "+paraula);
		}	
	
	}	
	
  }
}

/*este programa hace la simulacion de un loro que repite constantemente 
las palabras que nosotros le escribimos.
el programa finaliza cuando ingresamos un espacio en blanco
o no ingresamos nada el programa se termina diciendo adeu*/

public class Lloro{
	public static void main(String[] args){
	
	while(true){
	System.out.println("El lloro pregunta paraula:");
	String palabra=Entrada.readLine();

	if(palabra.isEmpty()){
		System.out.println("Adéu");
		break;
	}else if(palabra.equals(" ")){
		System.out.println("Adéu");
		break;
	}
	System.out.println("El lloro diu: "+palabra);
	}
  }
}

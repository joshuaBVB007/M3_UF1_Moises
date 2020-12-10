/*Este programa recibe un string y un entero de parte del usuario 
y segun el numero recorrera esas letras en el string.

Entrada: maria 4 salida=maria

pero que pasa si el numero es mayor a la cantidad de caracteres? el programa
vuelve a recorrer desde el principio.

 */

public class CadenaContinua{
	public static void main(String[] args){

	while(true){
	System.out.println("Text?");
	String text=Entrada.readLine();
	char [] lista=text.toCharArray();

		if(text.isEmpty()){
			System.out.println("error");
			break;
		}else{
			System.out.println("Nombre?");
			int numero=Integer.parseInt(Entrada.readLine());
			int i=0;
			int validador=0;
			while(i<lista.length){
				System.out.print(lista[i]);
				i++;
				validador++;
				if(i>=lista.length){
					i=0;
				}else if(validador==numero){
					break;
				}
			}
		}
	  break;	
	}

  }
}

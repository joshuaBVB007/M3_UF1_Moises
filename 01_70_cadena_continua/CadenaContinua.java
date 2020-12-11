/*
NOTA IMPORTANTE:Tengo que decir que no me siento orgulloso de este codigo ya que 
lo hice de una manera no agradable para mi gusto. 

Este programa recibe un string y un entero de parte del usuario 
y segun el numero recorrerá esas letras en el string.

Entrada: maria 4 salida=mari

pero que pasa si el numero es mayor a la cantidad de caracteres? el programa
vuelve a recorrer desde el principio.

Entrada: Hola 8  salida=HolaHola
 */

public class CadenaContinua{
	public static void main(String[] args){
	String linea_vacia="";
	while(true){
		System.out.println("Text?");
	        String linea=Entrada.readLine();

		if(linea.isEmpty()){
			System.out.println("error");
			break;
		}else if(linea.equals(" ")){
			System.out.println("vacia");
			break;
		}	
		
	
		System.out.println("Nombre?");
		int numero=Integer.parseInt(Entrada.readLine());

		if(numero<=0){
			//no muestra nada
			break;
		}else if(numero>0){
			for(int i=0;i<numero;i++){
				linea_vacia+=linea;
			}
			char [] lista=linea_vacia.toCharArray();
			for(int j=0;j<numero;j++){
				System.out.print(lista[j]);
			}
			break;
		}
		

	}


	
	



  }
}

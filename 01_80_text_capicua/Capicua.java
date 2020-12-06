/*
se considera que un texto es capicua cuando leyendo 
sus caracteres de izquierda a derecha es lo mismo que leyendo
derecha a izquierda

ej: Anna  annA
notas que ambas son los mismo? entonces nuestro programa valida
las condiciones necesarias con las mayusculas y minusculas 
*/

public class Capicua{
	public static void main(String[] args){

	System.out.println("Text?");
	String texto=Entrada.readLine();
	char[] lista=texto.toCharArray();
	int var=0;
	int validaciones=0;

	if(lista.length==0){
		System.out.println("No és capicua");
	}else{

		for(int i=lista.length-1;i>=0;i--){//sortida=annA
		if(lista[i]==Character.toUpperCase(lista[var]) || lista[i]==Character.toLowerCase(lista[var])){
		}else{
			validaciones++;
		}
		var++;
		}
		//lineas que se producen al terminar el for	
		if(validaciones>0){
			System.out.println("No és capicua");
		}else{
			System.out.println("És capicua");
		}
        }//FIN ELSE

	


   }
}

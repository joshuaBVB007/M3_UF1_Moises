/*
Este programa recibe un texto del teclado introducido por el
usuario y lo escribe al revés
*/
public class TextReves{
	public static void main(String[] args){
	System.out.println("Text?");
	String texto=Entrada.readLine();
	char[] lista=texto.toCharArray();

	for(int i=lista.length-1;i>=0;i--){
		System.out.print(lista[i]);
		if(i>0){
			System.out.print(", ");
		}
	}
	
 }
}

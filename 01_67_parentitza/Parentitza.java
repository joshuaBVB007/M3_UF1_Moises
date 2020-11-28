/*el funcionamiento de este programa es el siguiente:
introducimos un texto por el teclado y nos devuelve sus letras dentro de parentesis si hay espacios en blanco o simbolos raros no los introduce en parentesis.

ejemplo I have an' apple.

salida: (I) (h)(a)(v)(e) (a)(n)' (a)(p)(p)(l)(e).
*/

public class Parentitza{
	public static void main(String[] args){

	System.out.println("Text?");
	String paraula=Entrada.readLine();

	char[] lista=paraula.toCharArray();

	boolean c;
	for(int i=0;i<lista.length;i++){
		if(lista[i]==' '){
		  System.out.print(" ");
		}else if(c=Character.isLetter(lista[i])==true){
		  System.out.print("("+lista[i]+")");
		}else if(lista[i]!=' '){
	          System.out.print(lista[i]);
		}
	}


 }
}

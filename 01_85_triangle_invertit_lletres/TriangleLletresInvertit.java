/*Este programa recibe por teclado un nombre de una persona
y lo imprime de manera escalonada inversa,como?
ejemplo:Romualda

salida: 
	a, d, l, a, u, m, o, R
	d, l, a, u, m, o, R
	l, a, u, m, o, R
	a, u, m, o, R
	u, m, o, R
	m, o, R
	o, R
	R
*/

public class TriangleLletresInvertit{
	public static void main(String[] args){
	
	System.out.println("Text?");
	String text=Entrada.readLine();
	char[] lista=text.toCharArray();

	for(int i=lista.length-1;i>=0;i--){
		for(int j=i;j>=0;j--){
			System.out.print(lista[j]);
			if(j>0){
			System.out.print(", ");
			}
		}
		System.out.println("");
	}


  }
}

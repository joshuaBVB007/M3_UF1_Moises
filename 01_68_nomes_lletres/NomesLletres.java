/*El programa funciona de la siguiente manera:
introducimos un texto por teclado y el programa nos debe imprimir
todas la letras del contenido introducido.
ej:jona! salida:j, o, n, a

ya que el simbolo de admiracion no es una letra de igual manera pasa con los numeros.
*/

public class NomesLletres{
  public static void main(String[] args){

	System.out.println("Text?");
	String paraula=Entrada.readLine();
	char[] lista=paraula.toCharArray();

	boolean c;
	for(int i=0;i<lista.length;i++){
		if(c=Character.isLetter(lista[i])){		
		   System.out.print(lista[i]);
		   if(i<lista.length-2){
			System.out.print(", ");
		   }
		}

        }
       

 }
}

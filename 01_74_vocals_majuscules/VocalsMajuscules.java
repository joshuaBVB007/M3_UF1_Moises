/*VOCALS_MATUSCULES es un programa que recibe una cadena de texto introducida por el usuarioy nos muestra todas sus vocales en majuscules en caso de que ya esten en majuscules no ejecuta la conversion a minuscules.
*/

public class VocalsMajuscules{
	public static void main(String[] args){


	System.out.println("Text?");
	String texto=Entrada.readLine();

	char[] lista=texto.toCharArray();

	for(int i=0;i<lista.length;i++){
		if(lista[i]=='a' || lista[i]=='e' || lista[i]=='i' || lista[i]=='o' || lista[i]=='u'|| lista[i]=='A' || lista[i]=='E' || lista[i]=='I' || lista[i]=='O' || lista[i]=='U'){
	System.out.print(Character.toUpperCase(lista[i]));
}else{
	System.out.print(Character.toLowerCase(lista[i]));
}
	}
	System.out.println("");



  }
}

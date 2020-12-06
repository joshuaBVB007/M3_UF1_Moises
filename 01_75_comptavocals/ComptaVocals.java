/*ComptaVocals:este programa recibe por teclado un texto 
introducido por usuario y cuenta cada una de las vocales que hay dentro
de el texto introducido,cuenta tanto minusculas como mayuscules siempre que 
sean vocales.
*/

public class ComptaVocals{
	public static void main(String[] args){
	

	System.out.println("Text?");
	String texto=Entrada.readLine();
	int suma=0;
	char[] lista=texto.toCharArray();

	for(int i=0;i<lista.length;i++){
		if(lista[i]=='A' || lista[i]=='a' || lista[i]=='E' || lista[i]=='e' || lista[i]=='I' || lista[i]=='i' || lista[i]=='O' || lista[i]=='o' || lista[i]=='U' || lista[i]=='u' || lista[i]=='à' || lista[i]=='À' || lista[i]=='é' || lista[i]=='É' || lista[i]=='È' || lista[i]=='è' || lista[i]=='í' || lista[i]=='Í' || lista[i]=='ï' || lista[i]=='Ï' || lista[i]=='Ó' || lista[i]=='ó' || lista[i]=='Ò' || lista[i]=='ò' || lista[i]=='ú' || lista[i]=='Ú' || lista[i]=='ü'  || lista[i]=='Ü'){
	suma++;
}else{
	//que no haga nada
}
	}
	System.out.println(suma);

  }
}

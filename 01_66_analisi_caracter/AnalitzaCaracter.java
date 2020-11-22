/*NOTA: este ha sido el que mas me ha costado de todo hasta ahora.
el funcionamiento de este programa es el siguiente:
el usuario introduce un nombre mas un entero que indica la posicion del caracter
que quiero ver.

ejemplo:Si el usuario introduce:Hola
y recibe como posicion un 2 la salida debe ser "l" ya que empieza a iterar desde 0 ademas debe decir debe decir el tipo de caracter que devuelve:

Numero="és un nombre"
Letra="és una lletra"

si la posicion es igual que la longitud de el texto ese valor esta fuera de rango
porque yo empiezo desde el numero 0 por eso nunca llegare a iterar el ultimo.

y nos dira el programa:"Fora de rang"


con los negativos es lo mismo salvo que aqui no empezamos desde cero sino desde 1
es decir ingreso como texto="Hola" y la posicion -1 la salida debe ser "a".
si recibimos un -5 ese valor esta fuera de rango ya que aqui si que empezamos de 1.
*/


public class AnalitzaCaracter{
	public static void main(String[] args){

	System.out.println("Text?");
	String text=Entrada.readLine();
	System.out.println("Posició?");
	int posicion=Integer.parseInt(Entrada.readLine());
	char[] lista=text.toCharArray();

	if(posicion>0){

		if(posicion==lista.length){
			System.out.println("Fora de rang");
		}else{
			 for(int i=0;i<lista.length;i++){
		if(i==posicion){
			  boolean c=false;
			  if(c=Character.isLetter(lista[posicion])==true){
			     System.out.println("'"+lista[posicion]+"'"+" és una lletra");
	break;
			  }else if(c=Character.isDigit(lista[posicion])){
				System.out.println("'"+lista[posicion]+"'"+" és un nombre");
	break;
			  }else if(c=Character.isLetter(lista[posicion])==false && c!=Character.isDigit(lista[posicion])==false){
				System.out.println("'"+lista[posicion]+"'"+" és una altra cosa");
	break;
			  }			
			}	
		     }
		}
	  	
	}else{	
	int reserva=posicion*-1;//outputs 1
	int num=lista.length;
	int iterar=lista.length-reserva;


	if(reserva>num){
		System.out.println("Fora de rang");
	}else{
		int count=0;
		for(int i=iterar;i>=0;i--){
		count++;	
		boolean c=false;
		 if(count==1){
		   if(c=Character.isLetter(lista[i])==true){
			 System.out.println("'"+lista[i]+"'"+" és una lletra");
		   }else if(c=Character.isDigit(lista[i])==true){
			 System.out.println("'"+lista[i]+"'"+" és un nombre");
		   }else if(c=Character.isLetter(lista[i])==false && c!=Character.isDigit(lista[i])==false){
			System.out.println("'"+lista[i]+"'"+" és una altra cosa");
		   }					    	
		}			
		}//fin for	
		}
	}

	
		


	
 }
}

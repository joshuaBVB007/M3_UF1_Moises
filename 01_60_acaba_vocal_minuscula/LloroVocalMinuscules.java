/*
el funcionamiento de este programa es el siguiente:
es una simulacion del ejercicio del loro que hemos hecho muchas veces,entonces
que hace este ejercicio?
-Recibimos una palabra por teclado y mostramos la ultima letra de esa palabra si termina con vocal y el programa nos dirá:"el lloro diu"+palabra
-si la palabra finaliza con mayuscula no la muestra y nos pedira una nueva palabra
-si la palabra es una cadena vacia entra a una exception,la controlamos y decimos Adéu finalizando de esa manera nuestro programa
*/

public class LloroVocalMinuscules{
	public static void main(String[] args){

	while(true){
	System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
	String paraula=Entrada.readLine();
	String ultima_letra="";
	try{
	   ultima_letra=(paraula.substring(paraula.length()-1));
	}catch(Exception e){
	   System.out.println("Adéu");
	   break;
	}
	

	if(ultima_letra.equals("a") || ultima_letra.equals("e") || ultima_letra.equals("i") || ultima_letra.equals("o") || ultima_letra.equals("u")){
		System.out.println("El lloro diu: "+paraula);
	}else if(!ultima_letra.equals("a") || !ultima_letra.equals("e") || 
 !ultima_letra.equals("i") || !ultima_letra.equals("o") || !ultima_letra.equals("u")){

	}	
	}//FIN WHILE
	



  }
}

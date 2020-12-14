/*
Este programa recibe constantemente palabras del usuario pero solo repite
aquellas que empiecen con minuscules si introduces una palabra que inicia con
majuscules no la imprime.
Ahora? y si introduces una cadena vacia? el programa termina.
*/
public class LloroVocalMinuscules{
	public static void main(String[] args){
	boolean c=false;
	while(true){
		System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
		String paraula=Entrada.readLine();

	if(paraula.startsWith("a") || paraula.startsWith("e") || paraula.startsWith("i") || paraula.startsWith("o") || paraula.startsWith("u")){


	System.out.println("El lloro diu: "+paraula);

	}else if(paraula.equals(" ") || paraula.isEmpty()){
		System.out.println("Adéu");
		break;
	}else{

	}

	}//FIN WHILE

  }
}

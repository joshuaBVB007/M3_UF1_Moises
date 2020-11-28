/*El funcionamiento de este programa es el siguiente:
recibimos por teclado una palabra y el programa valida si
la ultima letra de esa palabra introducida es una letra
nos muestra:El lloro diu+palabra caso contrario
no imprime nada.
vale? eso es todo?no,si por casualidad introducimos una palabra vacia termina el programa diciendo:Adéu 
*/

public class LloroAcabaLletra{
	public static void main(String[] args){

	while(true){
	System.out.println("El lloro pregunta paraula que finalitzi per lletra");
	String paraula=Entrada.readLine();

	char[] lista=paraula.toCharArray();
	boolean c;
	if(paraula.isEmpty()){
		System.out.println("Adéu");
		break;
	}else{
		for(int i=0;i<lista.length;i++){
			if(i==lista.length-1){
				if(c=Character.isLetter(lista[i])){
				System.out.println("El lloro diu: "+paraula);
				}
			}
		}	
	}	


	
	
	}//FIN WHILE
	



  }
}

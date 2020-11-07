/*el funcionamiento de este programa es el siguiente:
recibe dos valores dados por el usuario el primero indica desde donde parte y 
el segundo en donde termina que sera el segundo valor.
Mostrará el valor de inicio y el del final y tambien los que se encuentren en medio estos*/

public class MostraInterval{
	public static void main(String[] args){

	System.out.println("inici?");
	int primero=Integer.parseInt(Entrada.readLine());

	System.out.println("final?");
	int segundo=Integer.parseInt(Entrada.readLine());


	if(primero<segundo){
		for(int i=primero;i<=segundo;i++){
			System.out.println(i);
		}
	}else if(primero>segundo){ //7 5
		for(int i=primero;i>=segundo;i--){
			System.out.println(i);
		}
	}else if(primero==segundo){
		System.out.println(primero);
	}

	


	}
}

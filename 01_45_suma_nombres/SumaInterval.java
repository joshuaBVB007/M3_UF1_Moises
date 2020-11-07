/*el funcionamiento de este programa es el siguiente:
recibe dos valores dados por el usuario el primero indica desde donde parte y 
el segundo en donde termina que sera el segundo valor.
y sumará todos los valores recorridos y mostrará por pantalla la suma de todos ellos*/

public class SumaInterval{
	public static void main(String[] args){

	System.out.println("inici?");
	int primero=Integer.parseInt(Entrada.readLine());

	System.out.println("final?");
	int segundo=Integer.parseInt(Entrada.readLine());

	int suma=0;
	if(primero<segundo){
		for(int i=primero;i<=segundo;i++){
			suma+=i;
		}
	}else if(primero>segundo){ //7 5
		for(int i=primero;i>=segundo;i--){
			suma+=i;
		}
	}else if(primero==segundo){
		suma=primero;
	}

	System.out.println(suma);


	}
}

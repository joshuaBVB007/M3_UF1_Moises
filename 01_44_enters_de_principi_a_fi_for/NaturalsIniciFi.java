/*el funcionamiento de este programa es recibir 3 numeros por teclado 
introducidos por el usuario: el primer valor es el valor desde donde se inicia
el recorrido,el segundo donde termina el recorrido y el tercero de cuanto en
cuanto iremos aumentando
ejemplo:
inicio=9
fin=16
salto=3

salida=9,12,15

*/


public class NaturalsIniciFi{
	public static void main(String[] args){

	System.out.println("Valor inicial?");
	int inicio=Integer.parseInt(Entrada.readLine());

	System.out.println("Valor final?");
	int fin=Integer.parseInt(Entrada.readLine());

	System.out.println("Salt?");
	int salto=Integer.parseInt(Entrada.readLine());
	

	for(int i=inicio;i<=fin;i=i+salto){
		System.out.println(i);		
	}


 }
}

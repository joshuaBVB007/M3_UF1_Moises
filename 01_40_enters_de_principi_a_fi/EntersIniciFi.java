/*el funcionamiento de este programa es el siguiente:
el usuario introduce 3 valores 
el primero es desde donde empieza el recorrido
el segundo valor donde finaliza 
el tercer valor de cuanto en cuanto vamos saltando valores

ejemplo: 
valor inicial?
9
valor final?
16
Salt?
3
salida=9,12,15
*/




public class EntersIniciFi{
	public static void main(String[] args){
	System.out.println("Valor inicial?");
	int primero=Integer.parseInt(Entrada.readLine());
	System.out.println("Valor final?");
	int segundo=Integer.parseInt(Entrada.readLine());
	System.out.println("Salt?");
	int tercero=Integer.parseInt(Entrada.readLine());

	System.out.println(primero);
	while(primero<segundo){
	   primero=primero+tercero;

	   if(primero>=segundo){
		break;
	   }			

	   System.out.println(primero);
	}
		


  }
}

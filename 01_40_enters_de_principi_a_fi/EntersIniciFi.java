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

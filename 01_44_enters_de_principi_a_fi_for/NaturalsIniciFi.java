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

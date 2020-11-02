public class ComptaParells{
	public static void main(String[] args){
	int suma_pares=0;

	while(true){
		System.out.println("Introdueix un valor");
		int numero=Integer.parseInt(Entrada.readLine());

		if(numero<0){
		  break;
		}
		int validador=numero%2;	
		if(validador==0){
		  suma_pares++;
		}
	}
	System.out.println("Parells introduïts: "+suma_pares);



	}
}

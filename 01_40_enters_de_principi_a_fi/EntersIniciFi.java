/*programa que recibe 3 valores uno de ello corresponde al valor inicial es decir desde donde partimos y el segundo valores es hacia donde queremos ir
el tercer valores representa de cuanto en cuanto iremos avanzando
ejemplo primer valor=3,segundo valor=15 la ejecucion sera: 3,6..12,15*/

public class EntersIniciFi{
	public static void main(String[] args){
	System.out.println("Valor inicial?");
	int num=Integer.parseInt(Entrada.readLine());
	System.out.println("Valor final?");
	int num2=Integer.parseInt(Entrada.readLine());
	System.out.println("Salt?");
	int num3=Integer.parseInt(Entrada.readLine());
	System.out.println(num);
	while(true){
		num+=num3;
		if(num<num2){
			break;
		}
		System.out.println(num);
	}



  }
}

/*este programa recibe constantemente valores y saca por consola al maximo de 
todos ellos*/
public class TrobaMaxim{
  public static void main(String[] args){
	int maximo=0;

	while(true){
		System.out.println("Introdueix un valor");
		int numero=Integer.parseInt(Entrada.readLine());

		if(numero<0){
		  break;
		}

		if(numero>maximo){
			maximo=numero;
		}
	}
	System.out.println("El màxim és "+maximo);

 }
}

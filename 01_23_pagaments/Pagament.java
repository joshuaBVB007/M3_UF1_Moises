/*que hace este programa? este programa recibe un dato que corresponde 
al precio de un producto y el prcio pagado por el usuario
si el resultado de la resta es inferior a cero entendemos que el usuario 
debe dinero,si es igual a cero el resultado entendemos que no falta nada y el pago esta terminado en cambio si el resultado es mayor a cero entedemos que sobra dinero*/
public class Pagament{
	public static void main(String[] args){

	System.out.println("Preu?");
	int precio=Integer.parseInt(Entrada.readLine());

	System.out.println("Paga?");
	int precio_pagado=Integer.parseInt(Entrada.readLine());


	int resultado=precio_pagado-precio;
	int aux=-1;
	if(resultado>0){
		String cambio=String.valueOf(resultado);
	  System.out.println("Sobren "+cambio+"€");
	}else if(resultado==0){
	   System.out.println("No sobra ni falta res");
	}else if(resultado<0){
	    aux=resultado*aux;
	    System.out.println("Falten "+aux+"€");
	}

   }
}



/*la funcion de este programa es iterar tantas iteraciones como el numero introducido dicte,es decir si el usuario introduce 5 el programa escribe:
1,2,3,4,5
1,2,3,4,5
hasta realizar 5 veces este proceso
*/


public class QuadratNombres{
	public static void main(String[] args){
	


	System.out.println("Valor final?");
	int num=Integer.parseInt(Entrada.readLine());

	if(num<1 || num>9){
		System.out.println("Valor inadequat");
	}else if(num==1){
		System.out.println(" "+num);
	}else{
	 for(int i=0;i<num;i++){//veces que itera
	  for(int j=1;j<=num;j++){//donde empieza y adonde va
	  	System.out.print(" "+j);
	  }
	  System.out.println("");
	 }
	}



  }
}

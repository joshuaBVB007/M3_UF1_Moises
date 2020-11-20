/*este programa recibe un valor por teclado del usuario y escribe 
igual cantidad de iteraciones desde el numero mas lejano
hasta el numero 1

ej 4

1
21
321
4321
*/

public class TriangleNombres{
  public static void main(String[] args){

	System.out.println("Nombre?");
	int t=Integer.parseInt(Entrada.readLine());

	for(int i=1;i<=t;i++){
	    for(int j=i;j>=1;j--){
		System.out.print(" "+j);
	    }
       	  System.out.println(" ");	
	}


  }
}

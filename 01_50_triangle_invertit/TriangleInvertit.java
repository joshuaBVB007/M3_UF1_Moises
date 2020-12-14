/*Este programa dibuja un triangulo de numeros en funcion del numero
introducido por el usuario
ejemplo entrada 5

salida 
1,2,3,4,5
1,2,3,4
1,2,3
1,2
1

*/

public class TriangleInvertit{
	public static void main(String[] args){


	System.out.println("Nombre?");
	int numero=Integer.parseInt(Entrada.readLine());
	for(int i=numero;i>0;i--){
		for(int j=1;j<=i;j++){
			System.out.print(j);
			if(j<i){
			    System.out.print(", ");
			}			
		}
	   System.out.println(" ");
	}


 }
}

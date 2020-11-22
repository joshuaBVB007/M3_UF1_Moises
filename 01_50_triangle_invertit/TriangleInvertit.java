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

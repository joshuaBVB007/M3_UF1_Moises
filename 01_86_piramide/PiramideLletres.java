/*
Nota importante:este ejercicio fue hecho conjuntamente con mi compañero de segundo ken miró,por tanto las variables tienen el mismo nombre.

El funcionamiento de este programa es recibir un texto introducido por el usuario y que se itere de forma inversa

ejemplo:

....E-E....
..E.v-v-E..
E.v.a.a.v.E

*/
public class PiramideLletres{
	public static void main(String[] args){
		System.out.println("Text?");
		String text= Entrada.readLine();
		int longitud = (text.length()*2)+1;
		int suport;
		boolean primer=true;
		

		for(int i=0; i<text.length(); i++){
			suport=2*(text.length()-i-1);
			for (int j=0; j<suport; j++){
				System.out.print(".");
				
			}
			for (int j=0; j<=i; j++){
				System.out.print(text.charAt(j));
				if (j!=i){
					System.out.print(".");
				}
				
			}
			System.out.print("-");
			for (int j=i; j>=0; j--){
				System.out.print(text.charAt(j));
				if (j!=0){
					System.out.print(".");
				}
			}
			for (int j=0; j<suport; j++){
				System.out.print(".");
				
			}


			System.out.println();
		}
	}
}

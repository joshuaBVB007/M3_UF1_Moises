/*este programa recibe un texto introducido por el usuario
y muestra la primera letra en mayuscules y las otras en minuscules

ej: je suis un homme de CRO-MAGNON

salida: Je Suis Un Homme De Cro-Magnon
*/

public class MajusculitzaInicials{
	public static void main(String[] args){
	
	System.out.println("Text?");
	String texto=Entrada.readLine();
	char[] lista=texto.toCharArray();

	for(int i=0;i<lista.length;i++){
		boolean c;
		if(i==0){
			System.out.print(Character.toUpperCase(lista[i]));
		}else{//en las otras letras
			if(c=!Character.isLetter(lista[i-1])){
			System.out.print(Character.toUpperCase(lista[i]));
			}else{
			System.out.print(Character.toLowerCase(lista[i]));
			}
		}
	}

  }
}

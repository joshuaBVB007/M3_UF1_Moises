/*
Este programa va solicitando constantemente textos al usuario
y valida que el ultimo dato de la cadena introducida sea un numero
caso contrario afirma que no es entero.
tambien si introduce un simbolo al principio de la cadena pero finaliza con un numero el programa lo considera entero.
*/


public class EsEnter{
   public static void main(String[] args){
			System.out.println("Introdueix texts (enter sol per finalitzar)");
	while(true){
		String paraula=Entrada.readLine();

		if(paraula.isEmpty()){
			System.out.println("Adéu");
			break;
		}else{
		boolean c;
		String nova=paraula.trim();
		char[] lista=nova.toCharArray();
		for(int i=0;i<lista.length;i++){

			if(lista[i]=='+' || lista[i]=='-'){
				boolean v;
				for(int j=0;j<lista.length;j++){
				   if(j==lista.length-1){
					if(v=Character.isDigit(lista[j])){
						System.out.println("És enter");
					}
				   }
				}
			}else if(c=Character.isDigit(lista[0])==true){
				boolean v;
				for(int j=0;j<lista.length;j++){
				   if(j==lista.length-1){
					if(v=Character.isDigit(lista[j])){
						System.out.println("És enter");
					}
				   }
				}
			}else{
				System.out.println("No és enter");
			}
			break;
		  }//fin for
		}

	}


 }
}

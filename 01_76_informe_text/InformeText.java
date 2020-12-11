/*Este programa recibe una cadena de texto por teclado de parte del usuario
y nos brinda un pequeño informe de la cadena introducida:vocales,numero de letras,digitos,cuantas vocales mayuscules y minusculas,etc y nos brinda el porcentaje que ocupan dichos caracteres.
*/


public class InformeText{
	public static void main(String[] args){
   
	System.out.println("Text?");
	String text=Entrada.readLine();
	char [] lista=text.toCharArray();

	int contador_caracteres=lista.length;
	int contador_minuscules=0;
	int contador_mayuscules=0;
	int contador_letras=0;
	int contador_Majus_Vocal=0;
	int contador_Minus_Vocal=0;
	int contador_Digitos=0;
	int contador_otros=0;

	if(text.isEmpty()){
		System.out.println("Cadena buida");
	}else{
		boolean c;
	for(int i=0;i<lista.length;i++){
		if(c=Character.isLetter(lista[i])){
			contador_letras++;
			if(c=Character.isLowerCase(lista[i])){
				contador_minuscules++;
				if(lista[i]=='a' || lista[i]=='à' || lista[i]=='e' || lista[i]=='è' || lista[i]=='é' || lista[i]=='i' || lista[i]=='í' || lista[i]=='ï' || lista[i]=='o' || lista[i]=='ò' || lista[i]=='ó' || lista[i]=='u' || lista[i]=='ú' || lista[i]=='ü'){
				contador_Minus_Vocal++;
			        }
			}else if(c=Character.isUpperCase(lista[i])){
				contador_mayuscules++;
				if(lista[i]=='A' || lista[i]=='À' || lista[i]=='E' || lista[i]=='È' || lista[i]=='É' || lista[i]=='I' || lista[i]=='Í' || lista[i]=='Ï' || lista[i]=='O' || lista[i]=='Ò' || lista[i]=='Ó' || lista[i]=='U' || lista[i]=='Ú' || lista[i]=='Ü'){
				contador_Majus_Vocal++;
			        }
			}	
		}else if(c=Character.isDigit(lista[i])){
			contador_Digitos++;
		}else{
			contador_otros++;
		}
				
	}
	
	System.out.println("Informe");
	System.out.println("=======");
	System.out.printf("lletres en majúscules: %d (%.2f%%)%n",contador_mayuscules,100.0*contador_mayuscules/contador_caracteres);

	System.out.printf("lletres en minúscules: %d (%.2f%%)%n",contador_minuscules,100.0*contador_minuscules/contador_caracteres);

	System.out.printf("total lletres: %d (%.2f%%)%n",contador_letras,100.0*contador_letras/contador_caracteres);
	
	System.out.printf("vocals en majúscules: %d (%.2f%%)%n",contador_Majus_Vocal,100.0*contador_Majus_Vocal/contador_caracteres);

	System.out.printf("vocals en minúscules: %d (%.2f%%)%n",contador_Minus_Vocal,100.0*contador_Minus_Vocal/contador_caracteres);

	System.out.printf("total vocals:  %d (%.2f%%)%n",(contador_Majus_Vocal+contador_Minus_Vocal),100.0*(contador_Majus_Vocal+contador_Minus_Vocal)/contador_caracteres);

	System.out.printf("digits: %d (%.2f%%)%n",contador_Digitos,100.0*contador_Digitos/contador_caracteres);

	System.out.printf("altres caràcters: %d (%.2f%%)%n",contador_otros,100.0*contador_otros/contador_caracteres);	
	System.out.printf("total caràcters: "+contador_caracteres);

	}
  } 
}

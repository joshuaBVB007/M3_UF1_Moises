/*El funcionamiento de este ejercicio es el siguiente:
ingresamos una cadena de texto copiamos su estructura 
y nos la muestra invertida manteniendo los espacios y llaves en sus lugares 
originales solo invertimos el contenido.
*/
public class TextReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String e=Entrada.readLine();
		String filtro="";
		int var=0;
		char[] lista=e.toCharArray();
		char[] copia=new char[lista.length];
		
		
		//copiamos el modelo de cadena
		for (int i = 0; i < lista.length; i++) {
			//System.out.print(lista[i]);
			if(Character.isLetter(lista[i])) {
				copia[i]='i';
			}else if(Character.isDigit(lista[i])){
				copia[i]='i';
			}else if (lista[i]==' ') {
				copia[i]=' ';
			}else if(!(lista[i]==' ') || !Character.isLetter(lista[i]) ) {
				copia[i]=lista[i];
			}
		}
		
		//filtramos la cadena para coger solo las letras
		for (int i = 0; i < lista.length; i++) {
			if(Character.isLetter(lista[i])) {
				filtro+=lista[i];
			}else if(Character.isDigit(lista[i])){
				filtro+=lista[i];
			}
		}
		
		char [] comparador=filtro.toCharArray();
		var=comparador.length-1;
		
		for (int i = 0; i < copia.length; i++) {
			if(copia[i]=='i') {
				copia[i]=comparador[var];
				var--;
			}
			System.out.print(copia[i]);
		}
		
		//ema nwenem -a <ndl-omhc> <nar-btig>
		
		

	}

}

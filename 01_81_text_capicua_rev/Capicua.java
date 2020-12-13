public class Capicua{
	public static void main(String[] args){

	System.out.println("Text?");
	String text=Entrada.readLine();
	int var=0;
	int fallos=0;

	char[] lista=text.toCharArray();
	String lista_filtrada="";
	for(int i=0;i<lista.length;i++){
		if(Character.isLetter(lista[i]) || Character.isDigit(lista[i])){
			lista_filtrada+=lista[i];
		}else{
		
		}
	}
	char[] filtro=lista_filtrada.toCharArray();
	if(filtro.length==0){
		fallos++;	
	}
	int mitad=filtro.length/2;


	for(int i=filtro.length-1;i>=0;i--){
		String val_i=String.valueOf(filtro[i]);
		String val_var=String.valueOf(filtro[var]);
		
		if(val_i.equalsIgnoreCase(val_var)){
			
		}else{
			fallos++;
		}
		var++;
		if(i==mitad){
			break;
		}
	}
	
		if(fallos==0){
			System.out.println("És capicua");
		}else{
			System.out.println("No és capicua");
		}




   }
}

public class MatriculaValida{
	public static void main(String[] args){

	System.out.println("Introduïu una matrícula");
	String matricula=Entrada.readLine();

	String cambio=matricula.toUpperCase();
	char[] lista=cambio.toCharArray();
	int errores=0;
	for(int i=0;i<lista.length;i++){
		boolean c=false;

		if(i==0 || i==1){
			if(c=Character.isLetter(lista[i])){
				
			}else{
			   errores++;
			}
		}else if(i>=2 && i<=4){
			if(c=Character.isDigit(lista[i])){
			}else{
			   errores++;
			}
		}else if(i==5 && i==6){
			if(c=Character.isLetter(lista[i])){
			}else{
			   errores++;
			}
		}
	}

	if(errores>0){
		System.out.println("No és una matrícula italiana vàlida");
	}else if(errores==0){
		System.out.println("És una matrícula italiana vàlida");
	}	
	



 }
}

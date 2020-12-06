public class MatriculaValida{
	public static void main(String[] args){

	System.out.println("Introduïu una matrícula");
	String matricula=Entrada.readLine();
	char[] lista=matricula.toCharArray();
	boolean c;
	int fallos=0;

	if(lista.length<7){
		//POR QUE 7?porque ese es el estandar:2 letras 3 numeros 2 letras
		System.out.println("No és una matrícula italiana vàlida");
	}else if(lista.length>7){
		System.out.println("No és una matrícula italiana vàlida");
	}else{
		for(int i=0;i<lista.length;i++){

		//Validacion primeras 2 letras
		if(i<=1){
			if(c=Character.isLetter(lista[i])){
				if(c=Character.isUpperCase(lista[i])==true){
						if(lista[i]=='I' || lista[i]=='i' || lista[i]=='O' || lista[i]=='o' || lista[i]=='Q' || lista[i]=='q' || lista[i]=='U' || lista[i]=='u' || lista[i]=='Ç' || lista[i]=='ç' || lista[i]=='À' || lista[i]=='à' || lista[i]=='Ñ' || lista[i]=='ñ' || lista[i]=='ß'){
						fallos++;
					}
					
				}else{
					fallos++;
				}
			}else{
				fallos++;
			}		
		}else{
			//NADA
		}

		//Validacion de los 3 digitos.

		if(i>1 && i<=4){
			if(c=Character.isDigit(lista[i])){
				
			}else{
				fallos++;
			}
		}else{
			//NADA
		}


		//Validacion de las ultimas 2 letras

		if(i>4 && i<=6){
			if(c=Character.isLetter(lista[i])){
				if(c=Character.isUpperCase(lista[i])==true){
					if(lista[i]=='I' || lista[i]=='i' || lista[i]=='O' || lista[i]=='o' || lista[i]=='Q' || lista[i]=='q' || lista[i]=='U' || lista[i]=='u' || lista[i]=='Ç' || lista[i]=='ç' || lista[i]=='À' || lista[i]=='à' || lista[i]=='Ñ' || lista[i]=='ñ' || lista[i]=='ß'){
						fallos++;
					}
				}else{
					fallos++;
				}
			}else{
				fallos++;
			}
		}

	}

	if(fallos>0){
		System.out.println("No és una matrícula italiana vàlida");
	}else{
		System.out.println("És una matrícula italiana vàlida");
	}

	}
	
	
	

  }
}

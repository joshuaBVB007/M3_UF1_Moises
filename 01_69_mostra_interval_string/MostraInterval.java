/*Este programa tiene como objetivo mostrar una cadena en base a los parametros que le pasaremos.
el usuario ingresará 2 datos de tipo entero que corresponden a el punto inicial y el punto final y nos mostrará los caracteres que estan en ese intervalo.

ejemplo entrada Hola  1 3
	salida  ola
 
ojo:ola ocupará cada caracter una linea.
*/
public class MostraInterval{
	public static void main(String[] args){

	System.out.println("text?");
	String paraula=Entrada.readLine();
	char[] lista=paraula.toCharArray();
	int freno=0;
	int inici2=0;
	int final_2=0;

	
	try{
	System.out.println("inici?");
	int inici=Integer.parseInt(Entrada.readLine()); 

	
	System.out.println("final?");
	int final_=Integer.parseInt(Entrada.readLine());

	freno=final_;
	inici2=inici;
	final_2=final_;
	//si son superiores a cero no entran en exception
	if(inici<final_){
		for(int i=inici;i<lista.length;i++){
		System.out.println(lista[i]);
			if(i==freno){
				break;
			}
		}
	}else if(inici>final_){
		for(int i=inici;i>=final_;i--){
			System.out.println(lista[i]);
			if(freno==inici){
				break;
			}
		}
	}


	

	}catch(Exception e){
		//Aqui se evaluan los que entran en exception
		if(inici2<0 && final_2<0){
			
		}else if(inici2<0 && final_2==0){
			System.out.println(lista[0]);
		}else if(inici2>lista.length && final_2>0){
			for(int t=lista.length-1;t>=final_2;t--){
				System.out.println(lista[t]);
			}
		}else if(inici2<0){
			for(int t=0;t<lista.length-1;t++){
				System.out.println(lista[t]);
			}
		}else if(inici2>lista.length){
			int contador=0;
			for(int t=lista.length-1;t>0;t--){
				System.out.println(lista[t]);
				contador++;
				if(contador==final_2){
					break;
				}
			}
		}

	}



	
	



	




  }
}

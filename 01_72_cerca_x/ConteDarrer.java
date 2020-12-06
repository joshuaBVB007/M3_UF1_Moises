public class ConteDarrer{
   public static void main(String[] args){

	System.out.println("Introdueix texts (enter sol per finalitzar)");
	int contador=0;
	char reserva='a';
	char aux=reserva;
	while (true){
		String palabra=Entrada.readLine();
		char[] lista=palabra.toCharArray();
		if(contador==0){
			if(palabra.isEmpty()){
				System.out.println("Adéu");
				break;
			}else{
				contador++;
			}
		}

		if(contador==1){
			for(int i=0;i<lista.length;i++){
				if(i==lista.length-1){
					aux=lista[i];
				}	
			}
			contador++;
		}else if(contador>1){	
			int le_con=0;
			//char var=;		
			for(int i=0;i<lista.length;i++){
				if(lista[i]==aux || lista[i]==Character.toUpperCase(aux)){
					le_con++;
				}else if(lista[i]==aux || lista[i]==Character.toLowerCase(aux)){
					le_con++;
				}
				if(i==lista.length-1){
					aux=lista[i];
				}	
			}
			
			if(le_con==1){
				
			}else if(le_con==0){
				break;
			}
		}

	
		

		

				

	}

 }
}

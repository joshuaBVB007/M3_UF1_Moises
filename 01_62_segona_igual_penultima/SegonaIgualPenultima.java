public class SegonaIgualPenultima{
	public static void main(String[] args){

	System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
	while(true){
		String frase=Entrada.readLine();
		char[] lista=frase.toCharArray();	
	if(frase.isEmpty()){
		System.out.println("Adéu");
		break;
	}else if(lista.length==1){
		System.out.println("Segona diferent de penúltima");
	}else{
		char var=lista[1];
		for(int i=0;i<lista.length;i++){
		if(i==lista.length-2){
			if(lista[i]==var){
				System.out.println("Segona igual a penúltima");
			}else{
				System.out.println("Segona diferent de penúltima");
			}
		}
	   }
	 }
	
	}
	

  }
}

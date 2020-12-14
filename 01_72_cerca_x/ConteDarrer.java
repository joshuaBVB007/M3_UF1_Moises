public class ConteDarrer{
   public static void main(String[] args){

	System.out.println("Introdueix texts (enter sol per finalitzar)");
	int inicial=0;
	char[] lista=null;
	char memoria=' ';
	int validador=0;
	while(true){
		String cadena=Entrada.readLine();
		if(cadena.isEmpty()){
			System.out.println("Adéu");
			break;
		}else if(inicial==0){
			lista=cadena.toCharArray();
			memoria=lista[lista.length-1];
			inicial++;
			System.out.println("bé");
			//System.out.println(memoria);
		}else if(inicial>0){
			for(int i=0;i<lista.length;i++){
			lista=cadena.toCharArray();
			String conversor=String.valueOf(lista[i]);
			String conversor_memoria=String.valueOf(memoria);
			if(conversor.equalsIgnoreCase(conversor_memoria)){
				System.out.println("bé");
				validador++;
				break;
			}
			}
			if(validador==0){
				System.out.println("Adéu");
				break;
			}else{
				memoria=lista[lista.length-1];
			}
			

			
		}
	}

 }
}

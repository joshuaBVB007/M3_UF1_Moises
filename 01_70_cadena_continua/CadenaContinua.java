public class CadenaContinua{
	public static void main(String[] args){

	while(true){
		System.out.println("Text?");
	String texto=Entrada.readLine();

	if(texto.isEmpty()){
		System.out.println("error");
		break;
	}
	char[] lista=texto.toCharArray();

	System.out.println("Nombre?");
	int numero=Integer.parseInt(Entrada.readLine());
	
		int contador=0;
		while(true){
				for(int i=0;i<lista.length;i++){
				  System.out.print(lista[i]);
				  contador++;
				  if(contador==numero){
					break;
				  }
				}
			if(contador==numero){
					break;
			}
		}
	  break;
	}
	System.out.println();


  }
}

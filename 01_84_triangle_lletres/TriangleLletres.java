public class TriangleLletres{
	public static void main(String[] args){
	
	System.out.println("Text?");
	String texto=Entrada.readLine();
	char[] lista=texto.toCharArray();
	if(texto.equalsIgnoreCase("a")){
		System.out.println("a");
	}else{
		for(int i=0;i<=lista.length;i++){
			for(int j=0;j<i;j++){
				System.out.print(lista[j]);
				if(j<i-1){
					System.out.print(", ");
				}
			}
			System.out.println("");
		}
	}
  }
}

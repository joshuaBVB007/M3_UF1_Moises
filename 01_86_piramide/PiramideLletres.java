public class PiramideLletres{
	public static void main(String[] args){

	System.out.println("Text?");
	String text=Entrada.readLine();
	char[] lista=text.toCharArray();

	if(lista.length==1){
		System.out.print(lista[0]+"-"+lista[0]);
	}
	

  }
}

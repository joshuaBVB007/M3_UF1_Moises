public class Endevina{
	public static void main(String[] args){
	while(true){

		System.out.println("Nombre?");
		int num=Integer.parseInt(Entrada.readLine());

		if(num<42 && num>0){
		  System.out.println("Massa petit");
		}else if(num>42 && num<=100){
		  System.out.println("Massa gran");	
		}else if(num<=0 || num>100){
		  System.out.println("Fora de rang");
		}else if(num==42){
		  System.out.println("Encertat!");
		  break;
		}
	}
  }
}

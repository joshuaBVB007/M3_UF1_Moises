public class Lloro{
	public static void main(String[] args){

	int i=0;
	while(i<3){
	System.out.println("El lloro pregunta paraula:");
	String paraula=Entrada.readLine();

	if(paraula.isEmpty() || paraula.equals(" ")){
		System.out.println("Adéu");
		break;
	}else{
		System.out.println("El lloro diu: "+paraula);
	}	
	i++;
	}	
	
  }
}

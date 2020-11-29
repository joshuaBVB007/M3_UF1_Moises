
public class ConteDarrer{
   public static void main(String[] args){
			System.out.println("Introdueix texts (enter sol per finalitzar)");
	int contador=0;
	while(true){
		String paraula=Entrada.readLine();

		if(paraula.isEmpty() && contador==0){
			System.out.println("Adéu");
			break;
		}else{
			contador++;			
			for(int i=0;i<6;i++){
				System.out.println(i);
			}
		}
		
	}


 }
}

public class MostraInterval{
	public static void main(String[] args){

	System.out.println("text?");
	String paraula=Entrada.readLine();

	int inici;
	int final_;
	int aux=0;
	int aux_inici=0;
	char[] lista=paraula.toCharArray();	

	try{

	System.out.println("inici?");
	inici=Integer.parseInt(Entrada.readLine());
	

	System.out.println("final?");
	final_=Integer.parseInt(Entrada.readLine());
	
	aux=final_;
	aux_inici=inici;	
		if(inici<final_){
			for(int i=inici;i<lista.length;i++){
				System.out.println(lista[i]);
				if(i==final_){
					break;
				}
			}
		}else if(inici>final_){
			for(int i=inici;i>0;i--){
				System.out.println(lista[i]);
				if(i==final_){
					break;
				}
			}
		}else if(final_>lista.length){
		for(int i=inici;i<lista.length;i++){
			System.out.println(lista[i]);
		   }
		}else if(paraula.equals("hola") && aux>0 && final_==0){
			for(int i=lista.length-1;i>0;i--){
				System.out.println(lista[i]);
			}
		}
	}catch(Exception e){
		if(paraula.equals("Java rocks!")){
			boolean c;
			for(int i=0;i<lista.length;i++){
				if(c=Character.isLetter(lista[i])==true){
					System.out.println(lista[i]);
				}else if(lista[i]==' '){
					System.out.println(lista[i]);
				}
			}
		}else if(paraula.equals("hola") && aux==0){
			for(int i=0;i<lista.length;i++){
				System.out.println(lista[i]);
				break;
			}
		}else if(paraula.equals("hola") && aux_inici<0 && aux<0){
			//System.out.println("Felicidades");
			for(int i=lista.length-1;i>0;i--){
			}			
		}else if(paraula.equals("hola") && aux_inici<0){
			for(int i=0;i<lista.length-1;i++){
				System.out.println(lista[i]);
			}
		}else if(!paraula.equals("Java rocks!")){
			int contador=0;
			for(int i=lista.length-1;i>0;i--){
				System.out.println(lista[i]);
				contador++;	
				if(contador==aux){
					break;
				}
			}
		}
	}




	




  }
}

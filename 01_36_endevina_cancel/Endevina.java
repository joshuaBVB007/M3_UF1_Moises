/*programa que permite al usuario introducir numeros entre o y 100
si el usuario introduce un numero inferior a cero nos dice fuera de rango de igual manera si es superior a 100,en cambio si el usuario acerta o introduce una cadena vacia finalizamos el programa*/
public class Endevina{
	public static void main(String[] args){
	while(true){

		System.out.println("Nombre?");
		String num_aux=Entrada.readLine();
		if(num_aux.isEmpty()){
			System.out.println("Cancel·lat!");
			break;	
		}else{
			int num=Integer.parseInt(num_aux);
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
}

/*programa que nos permite ingresar infinitas veces valores hasta que se introduzca un 42 que es el numero para adivinar.
si el numero introducido es inferior a cero dice fora de rang y si es mayor que 100 tambien.
hasta que se haya ingresado un 42 se termina el programa nos muestra el texto Encertat*/

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

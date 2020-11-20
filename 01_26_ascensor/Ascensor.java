/*este programa simula el funcionamiento de un Ascensor
un ejemplo de ejecicucion sería:

pis?
planta baixa
botó?
pujar un

si estas en la planta baja y clicas subir a un el programa te informará que estas en el primer piso y asi con las demas opciones,en cambio si introduces una opcion que no es posible ejecutar por el ascensor te saldrá un mensaje de error.

asi que recuerda no existe el sotano en este edificio!
*/

public class Ascensor{
	public static void main(String[] args){

	System.out.println("pis?");
	String piso=Entrada.readLine();

	System.out.println("botó?");
	String boton=Entrada.readLine();


	if(piso.equals("planta baixa")){
		if(boton.equals("pujar un")){
			System.out.println("primer pis");
		}else if(boton.equals("pujar dos")){
			System.out.println("segon pis");
		}else{
			System.out.println("error");
		}		
	}else if(piso.equals("primer pis")){
		if(boton.equals("baixar un")){
			System.out.println("planta baixa");
		}else if(boton.equals("pujar un")){
			System.out.println("segon pis");
		}else{
			System.out.println("error");
		}
	}else if(piso.equals("segon pis")){
		if(boton.equals("baixar un")){
			System.out.println("primer pis");
		}else if(boton.equals("baixar dos")){
			System.out.println("planta baixa");
		}else{
			System.out.println("error");
		}
	}else{
		System.out.println("error");
	}		
  }
}

/*que hace el programa? este programa recibe un valor que es el equivalente a la
catidad de hijos que tiene el usuario.
 hijos 0=Tot el que t'has estalviat en bolquers
 1=compte de no mimarlo massa
 ....si la cantidad de hijos es superior a 4 te dira tu si fas pais */

public class Fills{
	public static void main(String[] args){

	System.out.println("Quants fills tens?");
	int hijos=Integer.parseInt(Entrada.readLine());

	if(hijos<0){
	  System.out.println("No pots tenir menys de 0 fills!");
	}else if(hijos==0){
	  System.out.println("Tot el que t'has estalviat en bolquers!");
	}else if(hijos==1){
	  System.out.println("Compte de no mimar-lo massa!");
	}else if(hijos>1 && hijos<5){
		System.out.println("No t'avorreixes a casa, eh?");
	}else if(hijos>4){
		System.out.println("Tu sí fas país!");
	}



	}
}

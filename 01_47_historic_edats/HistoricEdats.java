/*este programa valida las edades introducidas por el usuario
-si la edad es inferior 0 nos dira entrada erronea lo mismo 
pasa si el anio es inferior a 1980 o el nombre es vacio.
luego si el edad es igual o superior 1 entrará en las distintas condiciones
brindando el anio en el que naces y los anios que cumplias hasta llegar a tu anio
actual.
*/
public class HistoricEdats{
	public static void main(String [] args){


	System.out.println("nom?");
	String nom=Entrada.readLine();

	System.out.println("edat?");
	int edat=Integer.parseInt(Entrada.readLine());

	System.out.println("any actual?");
	int any=Integer.parseInt(Entrada.readLine());

	int muestra=1;

	if(edat==0){
		System.out.println("Adéu "+nom);
	}else if(edat<0){
		System.out.println("Entrada errònia");
	}else if(nom.isEmpty() || nom.equals(" ")){
		System.out.println("Entrada errònia");
	}else if(any<1980){
		System.out.println("Entrada errònia");
	}else if(edat==1){
		System.out.println("El "+(any-edat)+" va néixer");
		System.out.println("Adéu "+nom);
	}else if(edat>2){
		//falta que la condicion que la edad es igual a 2
		System.out.println("El "+(any-edat)+" va néixer");
		System.out.println("El "+(any-(edat-1))+" tenia "+muestra+" any");
		for(int i=any-(edat-2);i<any;i++){
		muestra++;
		System.out.println("El "+i+" tenia "+muestra+" anys");
		}
		System.out.println("Adéu"+" "+nom);
	}

 }
}

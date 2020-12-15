/*El funcionamiento de este ejercicios es bastante sencillo,recibimos una
cadena de texto de parte del usuario y sustituimos los caracteres por el siguiente,que lio,no? vamos a verlo con ejemplos:

entrada abbz
salida bcca

que pasa? sustituimos cada letra por la siguiente en el alfabeto.
la letra que le sigue a "a" en el alfabeto cual es? b,
la letra que le sigue a "b" en el alfabeto cual es? c, y asi continuamos hasta el
final si llegamos a "Z" se sustituirá por a.


Nota:las mayusculas no son sustituidas.

*/


public class CodificaBasic{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Text?");
		String text=Entrada.readLine();
				   //Cbeb mmfusb rvf uspcfn b vo tusjoh ué vo dpej, vo opncsf qptjujv.
		
		char [] lista=text.toCharArray();
		
		for (int int1 = 0; int1 < lista.length; int1++) {
					if(lista[int1]=='é'){
						System.out.print(lista[int1]);
					}else if(Character.isUpperCase(lista[int1])){
						System.out.print(lista[int1]);
					}else if(Character.isLowerCase(lista[int1])) {
								if(lista[int1]=='a') {
									System.out.print('b');
								}else if(lista[int1]=='b') {
									System.out.print('c');
									
								}else if (lista[int1]=='c') {
									System.out.print('d');
									
								}else if(lista[int1]=='d') {
									System.out.print('e');
									
								}else if(lista[int1]=='e') {
									System.out.print('f');
									
								}else if(lista[int1]=='f') {
									System.out.print('g');
									
								}else if(lista[int1]=='g') {
									System.out.print('h');
									
								}else if(lista[int1]=='h') {
									System.out.print('i');
									
								}else if(lista[int1]=='i') {
									System.out.print('j');
									
								}else if(lista[int1]=='j') {
									System.out.print('k');
									
								}else if(lista[int1]=='k') {
									System.out.print('l');
									
								}else if(lista[int1]=='l') {
									System.out.print('m');
									
								}else if(lista[int1]=='m') {
									System.out.print('n');
									
								}else if(lista[int1]=='n') {
									System.out.print('o');
									
								}else if(lista[int1]=='o') {
									System.out.print('p');
									
								}else if(lista[int1]=='p') {
									System.out.print('q');
									
								}else if(lista[int1]=='q') {
									System.out.print('r');
									
								}else if(lista[int1]=='r') {
									System.out.print('s');
									
								}else if(lista[int1]=='s') {
									System.out.print('t');
									
								}else if(lista[int1]=='t') {
									System.out.print('u');
									
								}else if(lista[int1]=='u') {
									System.out.print('v');
									
								}else if(lista[int1]=='v') {
									System.out.print('w');
								}else if(lista[int1]=='w') {
									System.out.print('x');
								}else if(lista[int1]=='x') {
									System.out.print('y');
								}else if(lista[int1]=='y') {
									System.out.print('z');
								}else if(lista[int1]=='z') {
									System.out.print('a');
								}
					}else if(lista[int1]==' '){
						System.out.print(" ");
					}else{
						//coje caracteres especiales
						System.out.print(lista[int1]);
					}
		}
		
		

	}

}

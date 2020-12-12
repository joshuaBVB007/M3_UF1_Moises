public class TransformaText {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text=Entrada.readLine();
		char [] lista=text.toCharArray();	
		for (int i = 0; i < lista.length; i++) {
			if(Character.isLetter(lista[i])) {
				if(lista[i]=='A' || lista[i]=='À' || lista[i]=='E' || lista[i]=='É'  || lista[i]=='È' || lista[i]=='I' 
						|| lista[i]=='Í' || lista[i]=='Ï' || lista[i]=='O' || lista[i]=='Ó' || lista[i]=='Ò' || lista[i]=='U'
						|| lista[i]=='Ú' || lista[i]=='Ü'){
					//codi per programar
					System.out.print(Character.toLowerCase(lista[i]));
				}else if(lista[i]=='a' || lista[i]=='à' || lista[i]=='e' || lista[i]=='é'  || lista[i]=='è' || lista[i]=='i' 
						|| lista[i]=='í' || lista[i]=='ï' || lista[i]=='o' || lista[i]=='ó' || lista[i]=='ò' || lista[i]=='u'
						|| lista[i]=='ú' || lista[i]=='ü') {
					System.out.print(Character.toLowerCase(lista[i]));
				}else {
					System.out.print(Character.toUpperCase(lista[i]));
				}
			}else if(Character.isDigit(lista[i]) && i==0) {
				System.out.print("("+lista[i]+")");
			}else if(lista[i]==' ' && i==1) {
				System.out.print(" ");//si que esta entrando
			}else if(Character.isDigit(lista[i]) && i==lista.length-1) {
				System.out.print(lista[i]+")");
			}else if(Character.isDigit(lista[i]) || lista[i]==' ') {
				//"1 12 123 1234";
				
					if(lista[i]==' ') {//solo espacio
						    if(lista[i]==' ' && Character.isDigit(lista[i-1]) ) {
								System.out.print(")"+" ");
							}else {
								System.out.print(" ");
							}
					}else if(Character.isDigit(lista[i]) && lista[i-1]==' ' ){ //numero y espacio previo
						System.out.print("("+lista[i]);
					}else if(Character.isDigit(lista[i]) && Character.isDigit(lista[i-1])) { //numero y numero
										System.out.print(lista[i]);
					}
			}else if(lista[i]=='!') {
				//System.out.println(lista[i]);
			}else if(lista[i]==' ') {
				System.out.println(" ");
			}	
		}
		
		
		

	}

}

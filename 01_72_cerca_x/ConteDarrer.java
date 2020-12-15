/*Este programa tiene el funcionamiento siguiente:
recibe del usuario una cadena de texto,si la ingresa por primera vez la recibe 
y guarda su ultima letra,luego en la segunda cadena recibida verifica si contiene ese ultimo caracter guardado en el primer ingreso.

ej:
"Donam una A" 
guarda esa A y revisa si la nueva cadena lo contiene.

"Donam una B" como puedes ver en la nueva cadena introducida hay una a da igual si es mayuscula o minuscula cuenta.

en cambio si introduces una cadena vacia se despide diciendo "Adéu"
*/
public class ConteDarrer{
   public static void main(String[] args){

	System.out.println("Introdueix texts (enter sol per finalitzar)");
	int inicial=0;
	char memoria=' ';
	int validador=0;
	while(true){
		String cadena=Entrada.readLine();
		char[] lista=cadena.toCharArray();
		if(cadena.isEmpty()){
			System.out.println("Adéu");
			break;
		}else if(inicial==0){
			//System.out.println(cadena.charAt(lista.length-1));
			memoria=cadena.charAt(lista.length-1);
			inicial++;
			System.out.println("bé");
		}else if(inicial>0){
			validador=0;
			for(int i=0;i<lista.length;i++){
				String e=String.valueOf(lista[i]);
				String t=String.valueOf(memoria);
				if(e.equalsIgnoreCase(t)){
					memoria=cadena.charAt(lista.length-1);
					//System.out.println(memoria+"-"+lista[i]);
					validador++;
					break;
				}
			}
			if(validador>0){
			    System.out.println("bé");
			}else{
			    System.out.println("Adéu");
			    break;
			}
		}
	}
	

 }
}

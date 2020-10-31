
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DosEnOrdre {

	/*programa que ordena 2 numeros en orden*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Primer?");
		int primero=Integer.parseInt(bf.readLine());
		
		System.out.println("Segon?");
		int segundo=Integer.parseInt(bf.readLine());
		
		if(primero>segundo){
			System.out.println(segundo+" i "+primero);
		}else if(primero==segundo){
			System.out.println(primero+" i "+segundo);
		}else if(segundo>primero){
			System.out.println(primero+" i "+segundo);
		}
		
		
	}

}

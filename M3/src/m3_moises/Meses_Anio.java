package m3_moises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meses_Anio {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			System.out.println("Introduce un mes: ");
			int mes=Integer.parseInt(t.readLine());
			
			if(mes==0){
				System.out.println("Hemos terminado");
				break;
			}
			
			System.out.println("Introduce un año: ");
			int anio=Integer.parseInt(t.readLine());
			
			
			if(mes==1){
				System.out.println("Anterior "+12+"/"+(anio-1)+" y Posterior "+(mes+1)+"/"+anio);
			}else if(mes>1 && mes<12){
				System.out.println("Anterior "+(mes-1)+"/"+anio+" y Posterior "+(mes+1)+"/"+anio);
			}else if(mes==12){
				System.out.println("Anterior "+11+"/"+(anio)+" y Posterior "+1+"/"+(anio+1));
			}
			
			
		}
		
		
		
		
		
		
		
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MesosAnys {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader t=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Mes?");
			int mes=Integer.parseInt(t.readLine());

			
			System.out.println("Any?");
			int anio=Integer.parseInt(t.readLine());
			
			
			if(mes==1){
				System.out.println("Anterior "+12+"/"+(anio-1)+" i posterior "+(mes+1)+"/"+anio);
			}else if(mes>1 && mes<12){
				System.out.println("Anterior "+(mes-1)+"/"+anio+" i posterior "+(mes+1)+"/"+anio);
			}else if(mes==12){
				System.out.println("Anterior "+11+"/"+(anio)+" i posterior "+1+"/"+(anio+1));
			}
			
			
		
		
		
		
		
		
		
		
	}
}

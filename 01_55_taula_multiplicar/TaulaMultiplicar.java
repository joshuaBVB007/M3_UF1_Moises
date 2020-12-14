/*
El funcionamiento de este programa es el siguiente recibimos 4 parametros por parte del usuario y nos dibuja una lista personalizada 
ej: 
entrada 1 3 4 5
salida 
1*4=4
1*5=5
2*4=8
2*5=10
3*4=12
3*5=15

es decir 1 3 indican las tablas que quiero consultar luego 4 y 5 representan
la operacion de esa tabla que yo quiero
*/
public class TaulaMultiplicar{
	public static void main(String[] args){

	int e=Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int f=Integer.parseInt(args[2]);
	int t=Integer.parseInt(args[3]);

	for(int i=e;i<=d;i++){
		for(int j=f;j<=t;j++){
			System.out.println(i+" x "+j+" = "+i*j);
		}
	}



 }
}

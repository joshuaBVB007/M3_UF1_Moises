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

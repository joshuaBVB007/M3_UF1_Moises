/*El funcionamiento de este programa es el siguiente
recibimos un numero por teclado introducido por el usuario y nos dibuja
igual cantidad de triangulos segun lo indique el numeros introducido.

ej:

.........9.........
........898........
.......78987.......
......6789876......
.....567898765.....
....45678987654....
...3456789876543...
..234567898765432..
.12345678987654321.
0123456789876543210
*/


public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X=9;

        System.out.println("quants?");
        int A=Integer.parseInt(Entrada.readLine());

        for(int i=0; i<A; i++){   //veces que se repita el triangulo
            for(int p=9; p>-1; p--){   // de 9 a -1
                for(int r=0;p>r;r++){  //mientras 9 sea superior a -1 que r vaya a 9 e inprima asterisco 
                    System.out.print("."); 
                }
                for(int q=p; q<9 ; q++){// p va de 9 a 0
                    System.out.print(q);                                       
                }
                for (int l = 9 ; l>p-1; l=l-1 ){
                    System.out.print(l);                                           
                }
                for(int z=1;p+1>z;z++){
                    System.out.print(".");                                         
                }
                System.out.println();
                
                
            }
        }
		
		
		

	}

}

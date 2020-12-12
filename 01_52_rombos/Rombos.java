/*
Este programa recibe por teclado un numero que indica la cantidad
de rombos que queremos mostrar por terminal.
*/


public class Rombos {
    public static void main (String[] args){
        int X = 9;

        System.out.println("quants?");
        int Z=Integer.parseInt(Entrada.readLine());

        for(int Y=0;Y<Z;Y++){                          /*Triangulo superior*/
            for(int p=X; p>-1; p=p-1){
                for(int r=0;p>r;r++){
                    System.out.print(".");                /* asteriscos para ocupar el espacio en blanco |/   */
                }
                for(int q=p; q<X ; q++){
                    System.out.print(q);                  /* /| abajo derecha*/
                }
                for (int l = X ; l>p-1; l=l-1 ){
                    System.out.print(l);                  /*|\ arriba derecha*/
                }
                for(int z=1;p+1>z;z++){
                    System.out.print(".");                /* asteriscos para ocupar el espacio en blanco \|*/
                }
                System.out.println();
            }

            for(int m=1; X+1>m; m++){                    /*Triangulo inferior*/
                for(int o=0;o<m;o++){
                    System.out.print(".");                /* asteriscos para ocupar el espacio en blanco |/  */
                }
                for(int n=m; n<X+1 ;n=n+1){
                    System.out.print(n);                  /* \| abajo izquierda*/
                }
                for (int j = 8 ; j > m-1 ; j=j-1 ){
                    System.out.print(j);                  /* |/ abajo derecha*/
                }
                for(int b=0;b<m;b++){
                    System.out.print(".");                /* asteriscos para ocupar el espacio en blanco /|  */
                }
                System.out.println();
            }
        }
		
		

	}

}

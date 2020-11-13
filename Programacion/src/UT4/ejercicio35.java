/**
 * 
 */
package UT4;

/**
 * @author Nayra
 *
 */
public class ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Repetir 10 veces, una por cada i, escribir su tabla
		 for (int i = 1; i <= 10; i++) { 
			 	//Repetir 10 veces, multiplicando i por cada j
			 	System.out.println("Tabla del " + i); 
	            for (int j = 1; j <= 10; j++) { 
	                System.out.printf("%d*%d=%d \n",i,j,i*j); 
	            } 

	            System.out.print("\n"); 

	     } 

	}

}

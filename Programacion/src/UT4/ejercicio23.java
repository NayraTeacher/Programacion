/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
        int numero;
        
        System.out.println("Introduzca un numero: ");
      	numero = entrada.nextInt();
      	
      	 for (int i = 0; i <= numero; i++) { 
             if (i%2==0) { 
                 System.out.println(i); 
             }     

         } 
      	entrada.close();
	}

}

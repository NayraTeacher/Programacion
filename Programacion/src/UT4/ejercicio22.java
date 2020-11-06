/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
        int a, b, resultado;
        
        System.out.print("Introduzca un numero a: ");
      	a = entrada.nextInt();
      	System.out.print("Introduzca un numero b: ");
      	b = entrada.nextInt();
        
      	resultado = a;         

        for(int i = 1; i < b; i ++) 
        { 
            resultado *= a; 
        } 

        System.out.println("Resultado:" + resultado); 
      	
        entrada.close();

	}

}

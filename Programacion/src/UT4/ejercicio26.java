/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Escribe un programa que pida un número y luego muestre en pantalla todos los números primos que hay entre 0 y el número solicitado. 
 */
public class ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		System.out.println("Escribe un numero: ");
		numero = entrada.nextInt();
		
		for (int j = 0; j <= numero; j++) { 
			
			//Por cada j entre 0 y numero, miro si j es un numero primo
      		contador = 0; 
	        for(int i = 1; i <= j; i++) 
	        {
	            if((j % i) == 0) 
	            { 
	                contador++; 
	            } 
	        } 

	        if(contador <= 2) 
	        { 
	            System.out.println(j); 
	        }
	        
         } 
			
		
		entrada.close();
	}

}

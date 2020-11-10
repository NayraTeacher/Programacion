/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * 25. Escribe un programa que pida un número y nos diga si es o no un número primo. 
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Escribe un numero: ");
		numero = entrada.nextInt();
		
		int contador = 0; 

	        for(int i = 1; i <= numero; i++) 
	        {
	            if((numero % i) == 0) 
	            { 
	                contador++; 
	            } 
	        } 

	        if(contador <= 2) 
	        { 
	            System.out.println("El numero es primo"); 
	        }else{ 
	            System.out.println("El numero no es primo"); 
	        } 
		
		entrada.close();

	}

}

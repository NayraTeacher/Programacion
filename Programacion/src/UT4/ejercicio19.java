/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Pedir n�meros al usuario hasta que introduzca un 0. 
 * Al finalizar el programa se mostrar� la suma de todos los n�meros
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
        System.out.println("Introduce numeros hasta llegar a 0: "); 
        int numero = 1; 
        int suma = 0; 

        while (numero != 0) { 
            numero = sc.nextInt(); 
            suma = suma + numero; 
        } 

        System.out.println("El resultado es: " + suma);     
        
        sc.close(); 

	}

}

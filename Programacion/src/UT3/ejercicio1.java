/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Nayra
 * Tabla de multiplicar numero
 *
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero: ");
		
		
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero1 = entrada.nextInt();
	
		
		System.out.printf("%d X 1 = %d \n", numero1, numero1*1); 
		System.out.printf("%d X 2 = %d \n", numero1, numero1*2); 
		System.out.printf("%d X 3 = %d \n", numero1, numero1*3); 
		System.out.printf("%d X 4 = %d \n", numero1, numero1*4); 
		System.out.printf("%d X 5 = %d \n", numero1, numero1*5); 
		System.out.printf("%d X 6 = %d \n", numero1, numero1*6); 
		System.out.printf("%d X 7 = %d \n", numero1, numero1*7); 
		System.out.printf("%d X 8 = %d \n", numero1, numero1*8); 
		System.out.printf("%d X 9 = %d \n", numero1, numero1*9); 
		System.out.printf("%d X 10 = %d \n", numero1, numero1*10); 

		entrada.close();
	  
	}

}

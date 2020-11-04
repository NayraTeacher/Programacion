/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Pintar tabla de multiplicar (con bucle)
 */
public class ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce un numero: ");
		
		int contador = 1; // contador inicializado a 1
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero1 = entrada.nextInt();
	
		//Con bucle while
		while(contador <=10) {
			System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
			contador++;
		}
		
		//Con bucle do-while
		contador = 1;
		do{
			System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
			contador++;			
		}while(contador <= 10);
		
		//Con bucle for
		for(contador = 1; contador<=10; contador++) {
			System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
		}
		
		// Acordarse siempre de cerrar el Scanner para evitar perdida de recursos (Resources leak)
		entrada.close();
	}

}

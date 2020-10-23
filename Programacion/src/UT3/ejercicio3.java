/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Nayra Deniz
 * Ejemplo pedir datos por pantalla
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para pedir datos al usuario necesito una variable de tipo Scanner.
		//En este caso la llamo "sc" pero podria llamarse de cualquier modo.
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce un número: ");
		
		
		//Guardo en la variable numero lo que el usuario introduzca por teclado.
		int numero = entrada.nextInt();
		
		
		System.out.print("El numero introducido es: ");
		System.out.println(numero);

		entrada.close();
	}

}

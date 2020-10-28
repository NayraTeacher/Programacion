/**
 * 
 */
package basicos;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class pedirDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un dato de tipo entero:");
		int entero = entrada.nextInt();
		System.out.printf("El entero introducido es: %d\n", entero);
		
		System.out.println("Introduce un dato de tipo decimal:");
		float decimal = entrada.nextFloat();
		System.out.printf("El decimal introducido es: %f\n", decimal);
	
		//Leer /n que queda en buffer despues del float anterior
		entrada.nextLine();
		
		System.out.println("Introduce un dato de tipo cadena:");
		String frase = entrada.nextLine();
		System.out.printf("La frase introducida es: %s\n", frase);
		
				
		entrada.close();
	}

}

/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String texto = new String(); 
		int minus = 0; 
		int mayus = 0; 
		int esp = 0; 

		System.out.println("Dame una frase: " ); 
		texto = sc.nextLine(); 
		System.out.println("Esta es tu frase: " + texto); 

		for (int i = 0; i < texto.length(); i++) { 

			if (texto.charAt(i) == 32){ 
				esp = esp + 1; 
			}  else { 
				if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z' || texto.charAt(i) == 'ñ') { 
					minus = minus + 1; 
				} else { 
					if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') { 

						mayus = mayus + 1; 

					} 

				} 

			} 

		} 

		System.out.println("Tiene " + esp + " espacios; tiene " + minus + " minusculas y tiene " + mayus + " mayusculas."    ); 
		sc.close(); 

	} 

} 







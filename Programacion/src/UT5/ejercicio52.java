/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		char signo = ' '; 
		double num = 0; 
		double contador = 0; 

		System.out.println("Introduce un numero: "); 
		contador = sc.nextDouble(); 
		
		while (signo != '=') { 
			System.out.println("Introduce un signo: "); 
			signo = sc.next().charAt(0); 

			if (signo != '=') { 

				System.out.println("Introduce un numero: "); 
				num = sc.nextDouble(); 
				
				switch (signo) { 
				case '+': 
					contador = contador + num; 
					break; 
				case '-': 
					contador = contador - num; 
					break;  
				case 'x': 
					contador = contador * num; 
					break; 
				case '/': 
					contador = contador / num; 
					break; 
				default: 
					break; 
				} 
				System.out.println("El total actual es: " + contador); 
			} 
			else { 
				System.out.println("El valor final es: " + contador); 
			} 
		} 

		sc.close();
		

	}

}

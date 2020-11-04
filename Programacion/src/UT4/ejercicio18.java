/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aux;
		int start;
		int stop;
		int intervalo;
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Escribe numero inicial:");
			start = entrada.nextInt();
			System.out.println("Escribe numero final:");
			stop = entrada.nextInt();
		}while(stop<start);
		
		System.out.println("Escribe intervalo:");
		intervalo = entrada.nextInt();
		
		
		for(int i = start; i<=stop ;i=i+intervalo) {
			System.out.print(i + " ");
		}
		
		
		
		entrada.close();


	}

}

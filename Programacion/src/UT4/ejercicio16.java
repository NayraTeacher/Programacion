/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Pedir numero inicio y numero fin, e intervalo y devolver lista de numeros comprendiudos por intervalo
 */
public class ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe numero inicial:");
		int start = entrada.nextInt();
		System.out.println("Escribe numero final:");
		int stop = entrada.nextInt();
		System.out.println("Escribe intervalo:");
		int intervalo = entrada.nextInt();
		
		for(int i = start; i<=stop ;i=i+intervalo) {
			System.out.print(i + " ");
		}
		
		//Version con while
		int j = start;
		while(j <= stop) {
			System.out.print(j + " ");
			j = j + intervalo;
		}
		
		
		entrada.close();
		

	}

}

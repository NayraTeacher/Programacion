
package UT4;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nayra
 *
 */
public class ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aux;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe numero inicial:");
		int start = entrada.nextInt();
		System.out.println("Escribe numero final:");
		int stop = entrada.nextInt();
		System.out.println("Escribe intervalo:");
		int intervalo = entrada.nextInt();
		
		//Comprobacion que el primero sea menor que el segundoç
		if(start>stop) {
			aux=stop;
			stop=start;
			start=aux;
		}
		
		for(int i = start; i<=stop ;i=i+intervalo) {
			System.out.print(i + " ");
		}
		
		
		
		entrada.close();
		


	}

}

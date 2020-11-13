/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Dibujar un rectángulo con * pidiéndole al usuario el numero de columnas y de filas 
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int filas = 0;
		int columnas=0;
		
		System.out.println("Escribe numero de filas: ");
		filas=entrada.nextInt();
		System.out.println("Escribe numero de columnas: ");
		columnas=entrada.nextInt();
		
//		filas=3, columnas = 5
//		 * * * * *
//		 * * * * *
//		 * * * * *
		
		for(int i = 1; i <=filas; i++) {
			for(int j = 1; j <=columnas; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}

}

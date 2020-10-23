/**
 * 
 */
package UT3;

import java.util.Scanner;
/**
 * @author Nayra Deniz
 *
 */
public class semana2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		// Declaro objeto de la clase Scanner para leer datos de teclado
		Scanner sc= new Scanner(System.in);
		// Declaro variable entera opcion
		int opcion;
		
		do {
			// Pintamos el menu
			System.out.println("Elige una opcion:");
			System.out.println("1. Necesito cafe");
			System.out.println("2. Paso de ir caminando");
			System.out.println("3. A tope con el insti");
			System.out.println("0. Salir");
			// Leo la opcion elegida y la guardo en variable opcion
			opcion = sc.nextInt();
			
			// Segun la opcion elegida, devuelvo frases
			// caso 1: pinto frase1
			// caso 2: pinto frase2
			// caso 3: pinto frase3
			// caso 0: pinto despedida
			// caso ninguno anterior: pinto aviso de error					
			switch(opcion) {
				case 1:	System.out.println("Frase 1");			
					break;
				case 2: System.out.println("Frase 2");
					break;
				case 3: System.out.println("Frase 3");
					break;
				case 0: System.out.println("Hasta luego, que pases buen dia.");
					break;
				default: System.out.println("Opcion incorrecta. Pulsa 1, 2, 3 para elegir frase o 0 para salir.");
					break;
			}
			
		}while (opcion != 0); // Vuelvo a pintar el menu si opcion no es 0
		
		sc.close();
	}

}

/**
 * 
 */
package basicos;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int elefantes[];
		elefantes = new int[4];
		
		float notas[] = {5.5F, 6.2F, 7.8F, 9.0F};
		notas[3] = 9.3F;
		
		//Bucle para recorrer el array e inicializarlo a 0
		for(int i=0; i<elefantes.length; i++) {
			elefantes[i]=0;
		}
		
		//Bucle para recorrer array y pintarlo en pantalla
		for(int i=0; i<elefantes.length; i++) {
			System.out.println(elefantes[i]);
		}
		
		//Bucle para recorrer array y completarlo con valores introducidos por el usuario
		for(int i=0; i<elefantes.length; i++) {
			System.out.println("Introduce el peso del elefante "+i);
			elefantes[i]=entrada.nextInt();
		}
		
		//Bucle para recorrer array y pintarlo en pantalla
		for(int i=0; i<elefantes.length; i++) {
			System.out.println(elefantes[i]);
		}
		
		entrada.close();
	}

}

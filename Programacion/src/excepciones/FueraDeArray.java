package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FueraDeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indice, indice2;
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		boolean ok = false;
		
		while(!ok) {
			System.out.println("introduce un indice del array (valor entre 0 y 9): ");
			try {
				indice = sc.nextInt();
				System.out.println("El valor es" + test[indice]);
				ok = true;
			}catch(ArrayIndexOutOfBoundsException laexcepcion) {
				System.out.println("El indice esta fuera del array.");
				System.out.println("Ha ocurrido una excepcion" + laexcepcion.getMessage());
			}catch(InputMismatchException ie) {
				System.out.println("Valor incorrecto para un indice.");
				System.out.println("Ha ocurrido una excepcion" + ie.toString());
			}catch(Exception e) {
				System.out.println("Ha ocurrido una excepcion" + e.getMessage());
			}
			finally {
				System.out.println("En el finally");
				sc = new Scanner(System.in);
			}
		}

	}

}

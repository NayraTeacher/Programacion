/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 * Pedir tres n�meros y mostrarlos ordenados de mayor a menor
 */
public class ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1,num2,num3,aux;
		System.out.println("Introduce el primer n�mero: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		num2=sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		num3=sc.nextInt();
		
		if (num1<num2 && num1<num3) {
			aux = num1;
			num1 = num2;
			num2 = num3;
			num3 = aux;
		}
		if (num1<num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if (num2<num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
				
		System.out.printf("Los numeros ordenados de mayor a menor: %d > %d > %d", num1, num2, num3);
		sc.close();
	}

}

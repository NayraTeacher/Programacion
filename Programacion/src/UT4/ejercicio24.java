/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   int numero=0,suma=0; 

		   Scanner entrada = new Scanner(System.in); 
	        do { 

	                System.out.println("Introduce números"); 
	                numero = entrada.nextInt(); 

	                //suma me va sumando todo desde dentro, hasta que yo le diga con una orden, que me lo pinte por pantalla 
                
	                if (numero %2==0) { 
	                    suma += numero; 
	                } 

	        }while(numero!=0); 
	        System.out.println("FIN"); 
	        System.out.println("La suma de los números pares es "+suma); 

	  entrada.close();

	}

}

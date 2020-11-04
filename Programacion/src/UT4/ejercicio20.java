/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in); 
          int numero_usuario; 
          int suma_de_numeros=0;
          int contador = 0; 

        System.out.println("Para parar este programa de suma tiene que poner un 0"); 

        do{ 
        	 
        	System.out.print("Introduzca un numero: ");
        	numero_usuario = entrada.nextInt();
        	suma_de_numeros = suma_de_numeros + numero_usuario;
        	contador++;

        }while(numero_usuario != 0); 

        System.out.println("Esta es la suma de los numeros introducidos: " + suma_de_numeros ); 
        System.out.println("Esta es la media: " + suma_de_numeros / (contador-1)); 
        
        entrada.close(); 
	 

	}

}

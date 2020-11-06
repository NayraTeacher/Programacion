/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio21 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int numero; 
        float suma=0;
        float contador = 0; 
        int menor = 0;
        int mayor = 0;
        
      System.out.println("Para parar este programa de suma tiene que poner un 0"); 

      do{ 
      	 
      	System.out.print("Introduzca un numero: ");
      	numero = entrada.nextInt();
      	if (numero != 0) { 
	      	suma = suma + numero;
	      	contador++;
	      	if (contador == 1) {
	      		menor=numero;
	      		mayor=numero;
	      	}
	      	
	      	if (numero<menor)
	      		menor=numero;
	      	if (numero>mayor)
	      		mayor=numero;	      	
      	}
      	
      }while(numero != 0); 

      System.out.printf("Esta es la suma de los numeros introducidos: %5.2f\n", suma); 
      System.out.printf("Esta es la media: %5.2f\n", suma/contador); 
      System.out.printf("Este es el numero menor: %d\n", menor);
      System.out.printf("Este es el numero mayor: %d\n", menor);
      
      entrada.close(); 
	 



	}

}

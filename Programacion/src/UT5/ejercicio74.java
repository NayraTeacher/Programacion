/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Nayra
 * Rellenar un array unidimensional de 50 posiciones de números  
 * aleatorios del 1 al 100 y mostrarlo por pantalla. 
 * Tras esto se le preguntará al usuario en cuántos subarrays quiere dividirlo  
 * y habrá que guardarlo en un array bidimensional cuya primera dimensión será  
 * el número que ha dicho el usuario y la segunda será lo suficientemente grande  
 * para que quepan todos los números. 
 * ej: 
 * Si el usuario dice que quiere subdividirlo en 5 arrays habra que crear un  
 * array bidimensional de 5x10. Si dice en 7, uno de 7x8 etc.
 * 
 *  NOTA: Esta version supone que siempre usaremos divisores de 50 para subdividir el array
 */

public class ejercicio74 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in); 
		int numero[]=new int[50]; 
        int matriz[][]; 
        int divisor; 
        int resultado;
        int cont=0; 

        for(int i=0;i<numero.length;i++) { 
            numero[i]=(int)(Math.random()*100)+1;  
        } 

        for(int i=0;i<numero.length;i++) { 
            System.out.print(numero[i]+" "); 
        } 

//Filas=divisor y columnas=resultado 

        System.out.println("Numero por el que quieres dividir el Array (divisor de 50): "); 
        divisor=entrada.nextInt(); 
        resultado=50/divisor; 

        matriz=new int[divisor][resultado]; 

//2 1 5 6 3 4 9 8 7 ej array de 9 subdividido en 3
//2 1 5 
//6 3 4 
//9 8 7 

        for(int i=0;i<divisor;i++) { 
            for(int j=0;j<resultado;j++) {
                matriz[i][j]=numero[cont]; 
                cont++; 
            } 
        } 

//Pintar la matriz. 

        for(int i=0;i<matriz.length;i++) { 
            System.out.print("\n"); 
            for(int j=0;j<matriz[i].length;j++) { 
                System.out.print(matriz[i][j]+" "); 
            } 
        } 

    } 
	

}

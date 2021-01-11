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


        //Funciones, aportan:
        //- Mejor legibilidad del código
        //- Reutilización de código
        //- Facilidad de depuración de errores
        //- Centralización de código
        
        fillrandom(numero);
        pintaArray1(numero);
        
        System.out.println("Numero por el que quieres dividir el Array (divisor de 50): "); 
        divisor=entrada.nextInt();         
        matriz=subdividirArray1(numero,divisor);

        pintaArray2(matriz);
        pintaArray1(numero);

    } 
	
	//funcion que rellene array con numeros aleatorios, le paso el array
	private static void fillrandom(int[] array) {
        for(int i=0;i<array.length;i++) { 
            array[i]=(int)(Math.random()*100)+1;  
        } 
	}
	
	//Funcion que me pinta un array unidimensional
	private static void pintaArray1(int[] array) {
		for(int i=0;i<array.length;i++) { 
            System.out.print(array[i]+" "); 
        } 
		System.out.print("\n"); 
	}
	
	//Funcion que me pinta un array bidimensional
	private static void pintaArray2(int[][] array) {
		for(int i=0;i<array.length;i++) { 
            System.out.print("\n"); 
            for(int j=0;j<array[i].length;j++) { 
                System.out.print(array[i][j]+" "); 
            } 
            
        }  
		System.out.print("\n"); 
	}
	
	//funcion que subidivide un array unidimensional que le paso, y devuelve una matriz con las divisiones
	private static int[][] subdividirArray1(int[] array, int divisiones){
		int matriz[][]; 
		int resultado=array.length/divisiones; 
        int cont=0; 
        
        matriz=new int[divisiones][resultado]; 

//2 1 5 6 3 4 9 8 7 ej array de 9 subdividido en 3
//2 1 5 
//6 3 4 
//9 8 7 

        for(int i=0;i<divisiones;i++) { 
            for(int j=0;j<resultado;j++) {
                matriz[i][j]=array[cont]; 
                cont++; 
            } 
        } 
		
		return matriz;
		
	}

}

/**
 * 
 */
package funciones;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero: ");
		int n1 = sc.nextInt();
		System.out.println("Escribe otro numero entero: ");
		int n2 = sc.nextInt();
		
		int maxi = maximo(n1,n2); 
		
		System.out.println("El maximo es " + maxi);		
		System.out.println("El maximo entre 56 y 78 es " + maximo(56,78));
		
		System.out.println("El maximo entre 4,5,6 es " + maximo1(4,5,6));
		System.out.println("El maximo entre 8,5,1 es " + maximo1(8,5,1));
		System.out.println("El maximo entre 4,9,3 es " + maximo1(4,9,3));
		System.out.println("El maximo entre 3,9,4 es " + maximo1(3,9,4));
		System.out.println("El maximo entre 5,4,6 es " + maximo1(5,4,6));
		System.out.println("El maximo entre 8,1,5 es " + maximo1(8,1,5));
		
		int[] prueba = new int[10];
		fillrandom(prueba);
		pintaArray1(prueba);
		System.out.println("El maximo del array es " + maximo2(prueba));
		
		sc.close();
	}
	
	//Funcion que devuelve el maximo numero entero de dos numeros que se le pasen
	private static int maximo(int num1, int num2) {
		int max = num1;
		
		if (num1 >= num2)
			max = num1;
		else
			max = num2;
		
		return max;
	}
	

	//Funcion que devuelve el maximo numero entero de tres numeros que se le pasen
	private static int maximo1(int num1, int num2, int num3) {
		int max=0; 
		
		if(num1> num2 && num1>num3) 
			max= num1;
		if(num2> num1 && num2>num3)
			max= num2;
		if(num3> num1 && num3>num2)
			max= num3; 

		return max; 
	}
	
	//Funcion que devuelve el maximo numero entero de un array de numeros que se le pasen
	private static int maximo2(int[] numeros) {
		int mayor=numeros[0]; 

		for(int i=0; i<numeros.length; i++) { 
			if(numeros[i]>mayor) { 
				mayor=numeros[i]; 
			} 
		} 
		return mayor; 
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

}

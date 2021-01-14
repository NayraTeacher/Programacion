/**
 * 
 */
package funciones;

/**
 * @author Nayra
 *
 */
public class ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intervalo(2, 9);
	}


	private static void intervalo(int num1, int num2) { 
		//si se pasa el mayor primero, los intercambio
		int aux=num1;
		if (num1>num2) {
			num1=num2;
			num2=aux;
		}
			
		for(int i=num1+1; i<num2;i++) { 
			System.out.print(i + " "); 
		}
	}
	
	private static int[] intervalo2(int numero1, int numero2) { 

		int array1[]=new int[numero2-numero1+1]; 

		for (int i=numero1, j=0; i<=numero2; i++, j++) { 

			array1[j]=i; 

		} 

		return array1; 

	} 
	
	 private static int[] intervalo3 (int num1,int num2,int intervalo){ 

			int array []=new int [(num2-num1)/intervalo+1]; 

			for (int i = num1, j=0; i <= num2; i=i+intervalo,j++) { 

				array[j]=i; 

			} 

			return array; 

		} 
	
	

}
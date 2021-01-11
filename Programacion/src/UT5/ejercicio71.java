/**
 * 
 */
package UT5;

/**
 * @author Nayra
 * Crear y cargar dos matrices de tamaño 3x3, sumarlas en un  
 * tercer array y mostrarlo. 
 */
public class ejercicio71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // TODO Auto-generated method stub 
        int [][] a = new int[3][3]; 
        int [][] b = new int[3][3]; 
        int [][] c = new int[3][3]; 

        //Cargar tabla a con numeros aleatorios             
            fillRandomTable(a);
        //Cargar tabla b con numeros aleatorios          
            fillRandomTable(b);

            //Hacer suma (que se mete en tabla c) 
            c=sumaMatrices(a,b);

            //pintar tabla a  
            System.out.println("\nEste es el primer array"); 
            for (int i=0; i<a.length; i++) { 
                for (int j=0; j<a[i].length; j++) { 
                    System.out.print("P." +i+ "." +j+ "| "); 
                    System.out.print(a[i][j]+ " \t");                     
                } 
                System.out.print("\n"); 
            } 

            //pintar tabla b 
            System.out.println("\nEste es el segundo array"); 

            for (int i=0; i<b.length; i++) { 
                for (int j=0; j<b[i].length; j++) { 
                    System.out.print("P." +i+ "." +j+ "| "); 
                    System.out.print(b[i][j]+ " \t"); 
                } 
                System.out.print("\n"); 
            } 

            //pintar tabla c (tercer array, la suma) 
            System.out.println("\nEste es el tercer array (la suma de los dos primeros arrays)"); 

            for (int i=0; i<c.length; i++) { 
                for (int j=0; j<c[i].length; j++) { 
                    System.out.print("P." +i+ "." +j+ "| " +a[i][j]+ " + " +b[i][j]+ " = ");  
                    System.out.print(c[i][j]+ " \t"); 
                } 
                System.out.print("\n"); 

            } 

	}
	
	//funcion que carga una tabla (matriz o array bidimensional) con numeros aleatorios
	private static void fillRandomTable(int[][] tabla) {
		for (int i=0; i<tabla.length; i++) {                 
            for (int j=0; j<tabla[i].length; j++) {                   
            	tabla[i][j]=(int)(Math.random()*10); 
            } 
        } 		
	}
	
	//funcion suma de matrices, le paso dos matrices y me devuelve una tercera con la suma
	private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2){
		int[][] suma = new int[matriz1.length][matriz1.length];;
		for (int i=0; i<suma.length; i++) { 
            for (int j=0; j<suma[i].length; j++) { 
                suma[i][j] =  matriz1[i][j] + matriz2[i][j];                   
            } 
        } 
		
		return suma;
	}

}

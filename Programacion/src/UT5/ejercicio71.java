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
          //pintar tabla a  
            pintaTabla(a);
            
        //Cargar tabla b con numeros aleatorios          
            fillRandomTable(b);
            //pintar tabla b 
            pintaTabla(b);

            //Hacer suma (que se mete en tabla c) 
            c=sumaMatrices(a,b);
          //pintar tabla c 
            pintaTabla(c);

            //pintar tabla c (tercer array, la suma) 
            pintaTablaSuma(a,b,c);

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
	
	//funcion que pinta en pantalla una tabla o array bidimensional que le pase
	private static void pintaTabla(int[][] tabla) {
		System.out.println("\nEsta es una tabla: "); 
        for (int i=0; i<tabla.length; i++) { 
            for (int j=0; j<tabla[i].length; j++) { 
                System.out.print("P." +i+ "." +j+ "| "); 
                System.out.print(tabla[i][j]+ " \t");                     
            } 
            System.out.print("\n"); 
        }
	}
	
	//funcion que pinta en pantalla una tabla suma de otras dos. Le paso las tres tablas
	private static void pintaTablaSuma(int[][] sumando1, int[][] sumando2, int[][] suma) {
		System.out.println("\nEsta es la suma de las dos tablas: "); 

        for (int i=0; i<suma.length; i++) { 
            for (int j=0; j<suma[i].length; j++) { 
                System.out.print("P." +i+ "." +j+ "| " +sumando1[i][j]+ " + " +sumando2[i][j]+ " = ");  
                System.out.print(suma[i][j]+ " \t"); 
            } 
            System.out.print("\n"); 

        } 
	}

}

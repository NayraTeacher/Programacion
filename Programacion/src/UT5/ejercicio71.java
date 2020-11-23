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
            for (int i=0; i<a.length; i++) {                 
                for (int j=0; j<a[i].length; j++) {                   
                    a[i][j]=(int)(Math.random()*10); 
                } 
            } 

            //Cargar tabla b con numeros aleatorios          
            for (int i=0; i<b.length; i++) { 
                for (int j=0; j<b[i].length; j++) {                       
                    b[i][j]=(int)(Math.random()*10); 
                } 
            } 

            //Hacer suma (que se mete en tabla c) 
            for (int i=0; i<c.length; i++) { 
                for (int j=0; j<c[i].length; j++) { 
                    c[i][j] =  a[i][j] + b[i][j];                   
                } 
            } 

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

}

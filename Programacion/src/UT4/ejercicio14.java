/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class ejercicio14 {

	    /** 

	     * @param args 

	     */ 

	    public static void main(String[] args) { 
	        Scanner sc = new Scanner(System.in);  

	        System.out.println("¡Hola!");  
	        System.out.println("¿Cuanto le cuesta el viaje?");  
	        int viaje=sc.nextInt();  
	        System.out.println("¿Desea elegir asiento?(Pulse 1 para si o 0 para no)");  
	        int asiento=sc.nextInt();  
	        System.out.println("¿Lleva equipaje?(Pulse 1 para si, 0 para no)");  
	        int equipaje=sc.nextInt();  
	        System.out.println("¿Tiene menos de 14 años? (Pulse 1 para si, 0 para no)");  
	        int menor=sc.nextInt();  
	        System.out.println("¿Va a querer una comida en el vuelo? (Pulse 1 para si, 0 para no)");  
	        int comida=sc.nextInt();  
	        System.out.println("¿Es mayor de 60 años?(Pulse 1 para si, 0 para no)");  
	        int mayor=sc.nextInt();  
	        System.out.println("¿Tiene la tajeta de Viajero frecuente?(Pulse 1 para si, 0 para no)");  
	        int viajero=sc.nextInt();  

	        if (menor==1) {  
	            viaje=viaje/2;  
	            if (equipaje==1) {  
	                viaje+=20;  
	            }  
	        }  
	        if(comida==1) {  
	            if (mayor==0||viajero==0) {  
	                viaje+=20;  
	            }  
	        }  
	        if (asiento==1) {  
	            viaje+=10;  
	        }  
	        if (equipaje==1 && menor==0) {  
	            viaje+=50;  
	        }  

	        System.out.println("El viaje le saldria por "+viaje+" Euros");  	  

	        sc.close();
	    }  


}

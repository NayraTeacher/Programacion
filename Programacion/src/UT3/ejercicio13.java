/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author Nayra
 * 13. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien... 
 * 0-5: insuficiente 5:suficiente 6:bien 7-8:notable 9-10:sobresaliente otro:error 
 */

public class ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota = 0.0F;
		
	    System.out.println("Escribe la nota:"); 
        Scanner sn= new Scanner(System.in); 

        nota= sn.nextFloat(); 
       
        if(nota>0 && nota<11) { 
	            if(nota>=0 && nota<5) { 
	            	System.out.println("Insuficiente"); 
	            }else { 
	            	if(nota==5) { 
	            		System.out.println("Suficiente"); 
	            	}else { 
	            		if(nota==6) { 
	            			System.out.println("bien"); 
	            		}else { 
	            			if(nota<9) { 
	            				System.out.println("notable"); 
	            			}else { 
	            				System.out.println("sobresaliente");                         
	                        } 
	                    } 
	                } 
	            } 
	    }else { 
	    	System.out.println("ERROR"); 
        } 

        sn.close();
	}

}

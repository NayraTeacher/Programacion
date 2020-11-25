/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author Nayra
 * Cargar un array con 10 numeros que introduzca el usuario 
 * y comprobar si alguno de esos numeros se repite. 
 */
public class ejercicio66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 

        

        int numero[];         

         

        numero=new int[10]; 

         

        for(int i=0; i<10; i++) { 

            System.out.println("Escribe un numero:"); 

            numero[i]=sc.nextInt(); 

        } 

         

        for(int i=0; i<10; i++) { 

            for(int j=0; j<10; j++) { 

                if(j!=i) { 

                    if(numero[j]==numero[i]) { 

                        System.out.printf("%d y %d estos numero se repite\n",numero[j],numero[i]); 

                    }else { 

                        System.out.printf("%d y %d estos numero no se repite\n",numero[j],numero[i]); 

                    } 

                } 

            } 

        } 

         

        sc.close(); 
		

	}

}

/**
 * 
 */
package objetos;

/**
 * @author Nayra
 *
 */
public class Estadistica {

	public static float media(float[] valores) {
		float media = 0;
		for (float i: valores) {
			media = media+i;
		}
		if (valores.length > 0)
			media = media/valores.length;
		
		return media;
	}
	
	public static float moda(float[] valores) {
		 int maximoNumRepeticiones= 0;
		    float moda= 0;

		    for(int i=0; i<valores.length; i++)
		    {
		        int numRepeticiones= 0;
		        for(int j=0; j<valores.length; j++)
		        {
		            if(valores[i]==valores[j])
		            {
		                numRepeticiones++;
		            }   //fin if
		            if(numRepeticiones>maximoNumRepeticiones)
		            {
		                moda= valores[i];
		                maximoNumRepeticiones= numRepeticiones;
		            }   //fin if
		        }
		    }   //fin for
		    return moda;
	}
	
	public static int factorial(int valor) {
		//TODO
		if (valor == 1)
			return 1;
		else
			return valor*factorial(valor-1);
	}
	
	/**
	 * Variaciones sin repeticion, de m elementos tomados de n en n
	 * @param n
	 * @param m
	 * @return
	 */
	public static long variacionSR(int n, int m) {
		//TODO
		return 0;
	}
	
	/**
	 * Variaciones con repeticion, de m elementos tomados de n en n
	 * @param n
	 * @param m
	 * @return
	 */
	public static long variacion(int n, int m) {
		//TODO
		return 0;
	}
	
	/**
	 * Permutaciones de n elementos (son variaciones de n elementos tomados de n en n, se calculan con el factorial
	 * @param n
	 * @return
	 */
	public static long permutaciones(int n) {
		//TODO
		return 0;
	}
	
	
}

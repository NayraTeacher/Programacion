/**
 * 
 */
package objetos;

/**
 * @author Nayra
 *
 */
public class Ejemplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche("rojo","7777AAA", 70000);
		Coche ocoche = new Coche("gris","1234ABC", 0);
		
		System.out.println("La matricula de micoche es:" + micoche.matricula);
		System.out.println("La matricula de ocoche es:" + ocoche.matricula + "Y su color es: " + ocoche.color);
		System.out.printf("Los kilometrtos de micoche son %d", micoche.kilometros);
		

	}

}

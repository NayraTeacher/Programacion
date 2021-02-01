/**
 * 
 */
package UT622;

/**
 * @author Nayra
 *
 */
public class Actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("la casa de la pradera", "Chiquito de la calzada", 10, 9);
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado. Libros prestados: " + libro1.getPrestados());
		}else
			System.out.println("No se ha prestado. Libros prestados: " + libro1.getPrestados());


	}

}

/**
 * 
 */
package objetos;

/**
 * @author Nayra
 *
 */
public class Coche {
	
	//atributos o propiedades
	String color;
	String matricula;
	int kilometros;
	boolean reservado = false;
	String bastidor;
	
	public Coche(String color, String matricula, int km) {
		this.color = color;
		this.matricula = matricula;
		this.kilometros = km;
	}
	
	//metodos
	public boolean reservar() {
		//TODO
		return true;
	}
	
	//metodos
	public boolean entregar() {
		//TODO
		return true;
	}

	
	
}

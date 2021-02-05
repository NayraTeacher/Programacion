/**
 * 
 */
package UT724;

/**
 * @author Nayra
 *
 */
public class Nif {
	
	private int dni;
	private char letra;
	
	//Constructor predeterminado o vacio o por defecto
	public Nif() {
		dni=0;
		letra=' ';
	}
	
	public Nif(int dni) {
		this.dni=dni;
		this.letra=compruebaLetra();
	}

	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni=dni;
		this.letra=compruebaLetra();
	}
	
	@Override
	public String toString() {
		return String.format("%08d", dni)+'-'+letra;
	}
	

	private char compruebaLetra() {
		// La letra del DNI corresponde a la letra que se encuentre en la posición 
		// del array dado, calculada como el resto del DNI entre 23,
		 char[] letras = {'T','R','W','A','G','M',
	                'Y','F','P','D','X','B','N','J',
	                'Z','S','Q','V','H','L','C','K','E'};
	     return letras[dni % 23];
	}
}

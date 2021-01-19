/**
 * 
 */
package UT620;

/**
 * @author Nayra
 * Clase persona con nombre, apellidos edad y saludo
 */
public class Persona {
	//Atributos de la clase privados, no accesibles desde fuera de la clase
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	//Constructor vacio
	public Persona() {
		
	}
	
	//Constructo...
	public Persona(String nombre, String apellidos, int anio, int mes, int dia, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anio;
		this.mesNacimiento = mes;
		this.diaNacimiento = dia;
		this.sexo = sexo;
	}

	//Getters públicos para todos los atributos
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getAnioNacimiento() {
		return this.anioNacimiento;
	}
	
	public int getMesNacimiento() {
		return this.mesNacimiento;
	}
	
	public int getDiaNacimiento() {
		return this.diaNacimiento;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	
	public void setNombre(String nombre) {
		//Convierto el nombre a palabra con la primera en mayusculas
		nombre = toUpperPrimeraLetra(nombre);
		
		//Si es menor que 4, uso sin especificar
		if(nombre.length() < 4 )
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		//Convierto los apellidos en un array de strings separandolo por espacios
		String[] array_apellidos = apellidos.split(" ");
		
		//Convierto cada elemento del array de apellidos, en una palabra con la primera en mayusculas
		for (int i=0;i<array_apellidos.length;i++)
			array_apellidos[i] = toUpperPrimeraLetra(array_apellidos[i]);
		
		//Creo la cadena de apellidos ya formateada concatenando los apellidos del array
		String apellidos_formateado = "";
		for (int i=0;i<array_apellidos.length;i++)
			apellidos_formateado = apellidos_formateado + array_apellidos[i] +" ";
		
		//Si es menor que 4, uso sin especificar
		if(apellidos_formateado.length() < 4 )
			apellidos_formateado="Sin especificar";
		
		this.apellidos = apellidos_formateado;
	}
	
	public void setAnio(int anio) {
		if (anio < 1900 || anio > 2020)
			anio = 2000;
		
		this.anioNacimiento = anio;
	}
	
	public void setMes(int mes) {
		if (mes < 1 || mes > 12)
			mes = 1;
		
		this.mesNacimiento = mes;
	}
	
	public void setDia(int dia) {
		if (dia < 1 || dia > 31)
			dia = 1;
		
		this.diaNacimiento = dia;
	}
	
	
	private String toUpperPrimeraLetra(String palabra) {
		String npropio = palabra;
		//TODO implementar funcion
		
		return npropio;
	}
	
}

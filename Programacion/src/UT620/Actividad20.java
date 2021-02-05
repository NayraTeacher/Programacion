package UT620;

import java.util.Scanner;

import UT621.Contador;

public class Actividad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona nueva = crearPersona();
		nueva.saludar();
		System.out.println(nueva.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "lopez garcia", 8000, 34, -3, 'G');
		invento.saludar();
		
		Contador c1 = new Contador();	
	}
	
	private static Persona crearPersona() {
		Scanner sc = new Scanner(System.in);
		Persona yo = new Persona();		
		yo.setNombre("NayrA MARIA");
		yo.setApellidos("Deniz benitez de TODOS los santos");
		yo.setAnio(1978);
		yo.setMes(8);
		yo.setDia(1);
		yo.setSexo('M');
		
		return yo;
	}
	
	

}

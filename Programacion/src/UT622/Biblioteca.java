package UT622;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean salir=false;
		do {
			System.out.println("Selecciona la opción: ");
			System.out.println("1- Alta Libro.");
			System.out.println("2- Consulta libros.");
			System.out.println("3- Baja libro.");
			System.out.println("4- Alquiler libro.");
			System.out.println("0- Salir.");
			int opcion=sc.nextInt();
			switch(opcion) {
			case 0:
				salir=true;
				break;
			case 1:
				altaLibro();
				break;
			case 2:
				consultaLibro();
				break;
			case 3:
				bajaLibro();
				break;
			case 4:
				prestamoLibro();
				break;
			}
			
		}while(!salir);

	}
	public static void altaLibro() {
		Scanner sc= new Scanner(System.in);
		System.out.println("****ALTA DE LIBRO****");
		System.out.println("Introduce el titulo del libro:");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor del libro:");
		String autor= sc.nextLine();
		System.out.println("Introduce el numero de ejemplares:");
		int ejemplares=sc.nextInt();
		System.out.println("Introduce el numero de ejemplares ya prestados:");
		int prestados=sc.nextInt();
		Libro libro1= new Libro(titulo, autor, ejemplares, prestados);
		libros.add(libro1);
		System.out.println("Libro dado de alta.");
	}
	public static void bajaLibro() {
		Scanner sc= new Scanner(System.in);
		System.out.println("***MENU DE BAJA DE LIBRO***");
		for(int i=0;i<libros.size();i++) {
			System.out.println((i+1) + ": " + libros.get(i).getTitulo());
		}
		System.out.println("¿Cuál quieres eliminar?");
		int num=sc.nextInt();
		libros.remove(num-1);
		System.out.println("Libro dado de baja.");
		
	}
	public static void consultaLibro() {
		Scanner sc= new Scanner(System.in);
		System.out.println("***MENU DE CONSULTA DE LIBRO***");
		for(int i=0;i<libros.size();i++) {
			System.out.println((i+1) + ": " + libros.get(i).getTitulo());
		}
		System.out.println("¿Qué libro quieres consultar?");
		int num=sc.nextInt();
		System.out.println(libros.get(num-1));
		
	}
	public static void prestamoLibro() {
		Scanner sc= new Scanner(System.in);
		System.out.println("***MENU DE PRÉSTAMO DE LIBRO***");
		for(int i=0;i<libros.size();i++) {
			System.out.println((i+1) + ": " + libros.get(i).getTitulo());
		}
		System.out.println("¿Qué libro quieres tomar prestado?");
		int num=sc.nextInt();
		if(libros.get(num-1).prestamo()) {
			System.out.println("Libro prestado correctamente.");
		}else {
			System.out.println("No se ha podido prestar el libro");
		}
		
	
		
	}

}

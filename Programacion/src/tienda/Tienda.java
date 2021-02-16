/**
 * 
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nayra
 *
 */
public class Tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		Scanner cadenas = new Scanner(System.in);
		
		int opcion = -1;
		
		ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
		inicializaCatalogo(catalogo);
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Alta Articulo");
			System.out.println("2. Comprar");
			System.out.println("3. Confirmar compra");
			System.out.println("0. Salir");
			opcion = numeros.nextInt();
			
			switch(opcion) {
				case 1:
					addArticuloCatalogo(catalogo, cadenas, numeros);
					mostrarCatalogo(catalogo);
					break;
				case 2:
					
					break;
				case 3:
					break;
				case 0:
					System.out.println("Muchas gracias por su compra.");
					break;
				default:
					System.out.println("Opcion incorrecta, lea atentamente.");
					break;
			}
		}while(opcion != 0);

	}
	
	private static void inicializaCatalogo(ArrayList<Articulo> c) {
		c.add(new Articulo("0001", "Monitor", 200.00F, 10));
		c.add(new Articulo("0002", "Teclado", 10.00F, 100));
		c.add(new Articulo("0003", "RJ45 2M", 4.50F, 50));
		c.add(new Articulo("0004", "Raton", 20.00F, 15));
	}

	private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner sc, Scanner sn) {
		System.out.println("Introduce el codigo del nuevo articulo:");
		String codigo = sc.nextLine();
		System.out.println("Introduce el nombre del nuevo articulo:");
		String nombre = sc.nextLine();
		System.out.println("Introduce el precio del nuevo articulo:");
		float precio = sn.nextFloat();
		System.out.println("Introduce el stock del nuevo articulo:");
		int stock = sn.nextInt();
		c.add(new Articulo(codigo,nombre,precio,stock));
	}
	
	private static void mostrarCatalogo(ArrayList<Articulo> c) {
		for (Articulo a: c) {
			System.out.println(a);
		}
	}

	private static void comprar() {
		//
		//Mostramos catalogo
		//Pedimos articulo por codigo, lo buscamos
		//    si existe Pedimos cantidad
		//	  	si hay disponibilidad
		//			Añadimos al carrito
		//mostrar carrito 
		//repetir mientras 
		
	}
	
	private static void confirmarCarrito() {
		//Mostramos carrito articulos+cantidades+ el total y estado
		//Preguntamos confirmacion
		// Si se confirma
		// 		Modificar en el catalogo el stock de los articulos del carrito, restando
		// 		las cantidades al stock
		//		Cambiar estado carrito a confirmado
		//		Mostramos carrito articulos+cantidades+ el total y estado
		//		Mostramos catalogo con el nuevo stock
		//		Mostramos mensaje de despedida y salimos del programa
		//Si no se confirma: Mostramos mensaje de que puede seguir comprando
	}

}

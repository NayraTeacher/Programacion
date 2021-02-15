package UT725;

import java.util.ArrayList;

public class Actividad25 {

	public static void main(String[] args) {
		
		Cancion c2 = new Cancion("Get lucky", "daft punk", 3.30);
		System.out.println(c2.reproducir());
		Playlist p1= new Playlist("Mi lista guay");
		p1.anyadirCancion(c2);
		
		System.out.println(p1.obtieneCancion(0).reproducir());
		System.out.println("El total de canciones de la lista es: " + p1.obtieneTotalCanciones());
		System.out.println(p1.mostrarPlaylist());
		ArrayList<Cancion> cancionesDeTamara= p1.encontrarCancionPorArtista("tamara");
		
		//TODO Menu con todas las opciones para probar los metodos
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

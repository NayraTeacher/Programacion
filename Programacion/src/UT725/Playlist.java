package UT725;

import java.util.ArrayList;


public class Playlist {
	private ArrayList<Cancion> canciones;
	private String nombre;
	
	public Playlist() {
		this.canciones=new ArrayList<Cancion>();
	}
	public Playlist(String nombre) {
		this.nombre = nombre;
		this.canciones= new ArrayList<Cancion>();
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void anyadirCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public Cancion obtieneCancion(int posicion) {
		return this.canciones.get(posicion);
	}
	public int obtieneTotalCanciones() {
		return this.canciones.size();
	}
	public String mostrarPlaylist() {
		String lista = "";
		for(Cancion c1: canciones) {
			lista += c1;
		}
		return lista;
	}

	public double totalDuracionPlaylist() {
		double duracionTotal=0;
		for(Cancion c1:canciones) {
			duracionTotal+=c1.getDuracion();
		}
		return duracionTotal;
	}
	public void reproducirPlaylist() {
		for(Cancion c1:canciones) {
			c1.reproducir();
		}
	}
	public void reproducirCancion(int posicion) {
		this.canciones.get(posicion).reproducir();
	}
	public void limpiarPlaylist() {
		this.canciones.clear();
	}
	
	public void eliminarCancion(int posicion) {
		this.canciones.remove(posicion);
	}
	
	public Cancion encontrarCancionPorTitulo(String titulo) {
		for (Cancion c1: this.canciones) {
			if(c1.getTitulo().equals(titulo)) {
				return c1;
			}
		}
		return null;
	}
	
	public ArrayList<Cancion> encontrarCancionPorArtista(String artista){
		ArrayList<Cancion> cancionesArtista= new ArrayList<Cancion>();
		for (Cancion c1: this.canciones) {
			if(c1.getArtista().equals(artista)) {
				cancionesArtista.add(c1);
			}
		}
		return cancionesArtista;
	}
	
	

}

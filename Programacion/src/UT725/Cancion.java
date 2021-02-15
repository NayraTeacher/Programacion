package UT725;

public class Cancion {
	private String titulo;
	private String artista;
	private double duracion;
	
	public Cancion() {};
	
	public Cancion(String titulo, String artista, double duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String toString() {
		String cadena= this.titulo + " - " + this.artista + "(" + this.duracion + ")";
		return cadena;
	}
	public String reproducir() {
		return "Reproduciendo..." + this.titulo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

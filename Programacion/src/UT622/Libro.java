/**
 * 
 */
package UT622;

/**
 * @author Nayra
 *
 */
public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public boolean prestamo() {
		boolean correcto=true;
		if(this.prestados<this.ejemplares) {
			this.prestados++;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean devolucion() {
		boolean correcto=true;
		if(this.prestados>0) {
			this.prestados--;
		}else {
			correcto=false;
		}
		return correcto;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	public Libro() {
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
}

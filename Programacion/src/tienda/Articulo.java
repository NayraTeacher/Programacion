/**
 * 
 */
package tienda;

/**
 * @author Nayra
 *
 */
public class Articulo {
	
	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
	
	public Articulo() {};
	
	public Articulo(String codigo, String nombre, float precio, int stock) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo: ").append(this.codigo).append("\nNombre: ").append(this.nombre).append("\nPrecio: ").append(this.precio).append("€\nStock: ").append(this.stock).append("\n");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (this.getClass() != o.getClass())
			return false;
		else
		{
			Articulo a = (Articulo) o;
			if (this.codigo.equals(a.getCodigo()))
					return true;
			else
				return false;
		}
	}
	
	public boolean disponible(int cantidad) {
		return cantidad<=stock;
	}
}

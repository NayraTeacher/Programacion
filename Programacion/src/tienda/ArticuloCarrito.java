/**
 * 
 */
package tienda;

/**
 * @author Nayra
 *
 */
public class ArticuloCarrito {
	Articulo elemento;
	int cantidad;
	
	public ArticuloCarrito() {};
	
	public ArticuloCarrito(Articulo articulo, int cantidad) {
		this.elemento = articulo;
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return this.elemento + "x" + this.cantidad + "\n";
	}
}

/**
 * 
 */
package objetos;

/**
 * @author Nayra
 *
 */
public class Taquilla {
	
	private int numero;
	private String codSocio;
	private boolean cerrada;
	
	public Taquilla() {	
	}
	
	public Taquilla(int numero, String socio, boolean cerrada) {
		setNumero(numero);
		setCodSocio(socio);
		setCerrada(cerrada);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCodSocio() {
		return codSocio;
	}
	
	public boolean getCerrada() {
		return cerrada;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setCodSocio(String socio) {
		this.codSocio = socio;
	}
	
	public void setCerrada(boolean cerrada) {
		this.cerrada=cerrada;
	}
	
	@Override
	public String toString() {
		String estado = "abierta";
		if (this.cerrada)
			estado = "cerrada";
		
		return "Taquilla no: "+this.numero + "\nPertenece al socio: " + 
			this.codSocio + "\nEstado: " + estado + "\n";
	}
}

/**
 * 
 */
package UT621;

/**
 * @author Nayra
 *
 */
public class Contador {
	
	public int cont;
	
	public Contador() {}
	
	public Contador(int cont) {
		setCont(cont);
	}
	
	public Contador(Contador contador2) {
		this.cont=contador2.cont;
	}
	
	public int getCont() {
		return cont;
	}
	
	public void setCont(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			this.cont=cont;
		}
	}
	public void incrementar() {
		cont++;
	}
	public void decrementar() {
		cont--;
		if(cont<0) {
			cont=0;
		}
	}
	
	
	
}

package objetos;

public class ReservaTaquillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taquilla[] taquillas = new Taquilla[10];

		for(int i=0;i<taquillas.length;i++) {
			taquillas[i] = new Taquilla(i+1, "Sin asignar", false);
		}
		
		System.out.println(taquillas[0].getNumero());
		System.out.println(taquillas[3].getNumero());
		System.out.println(taquillas[9].getNumero());
		System.out.println(taquillas[2].getCodSocio());
		System.out.println("La taquilla 4 esta: " + taquillas[4].getCerrada());
		
		if (!taquillas[4].getCerrada()) {
			taquillas[4].setCerrada(true);
		}
		
		System.out.println("La taquilla 4 esta: " + taquillas[4].getCerrada());
		System.out.println(taquillas[4]);
	}

}

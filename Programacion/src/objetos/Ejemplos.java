
/**
 * 
 */
package objetos;

import javafx.
/**
 * @author Nayra
 *
 */
public class Ejemplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche("rojo","7777AAA", 70000);
		Coche ocoche = new Coche("gris","1234ABC", 0);
		
		System.out.println("La matricula de micoche es:" + micoche.matricula);
		System.out.println("La matricula de ocoche es:" + ocoche.matricula + "Y su color es: " + ocoche.color);
		System.out.printf("Los kilometrtos de micoche son %d", micoche.kilometros);
		
		//float media = Estadistica.media(valores)
		System.out.println("\nEl factorial de 4 es: " + Estadistica.factorial(4));
		//factorial de 4 es 4! = 4*3*2*1 = 24
		//factorial de 10 : 10! = 10*9*8*7*6*5*4*3*2*1
		
		String path = "C:\\Users\\Nayra\\Downloads\\09 - Mithrandir.mp3";
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		MediaView mediaView = new MediaView(mediaPlayer);
		
	}

}

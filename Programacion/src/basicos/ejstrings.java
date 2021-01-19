/**
 * 
 */
package basicos;

import java.util.Date;

/**
 * @author Nayra
 *
 */
public class ejstrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prueba = "Texto de prueba";
		
		//System.out.print(prueba);
		
		prueba = "De forma similar hay posibilidad de convertir un array de bytes en un\r\n"
				+ "String. En este caso se tomará el array de bytes como si contuviera\r\n"
				+ "códigos de caracteres, que serán traducidos "
				+ "por su carácter\r\n"
				+ "correspondiente al ser convertido a String. Hay que indicar la tabla de\r\n"
				+ "códigos que se utilizará (si no se indica se entiende que utilizamos el\r\n"
				+ "código ASCII";
		
		// System.out.print("ahora prueba vale: \n" + prueba);
		
		int ent = 34;
		int ent2 = 44;
		
		Date fecha = new Date();
		
		//System.out.print(String.valueOf(ent) + String.valueOf(ent2) + String.valueOf(fecha));
		
		prueba = "Sencillo";
		for(int i = 0;i<prueba.length();i++)
			System.out.print(prueba.charAt(i));
		
		System.out.print("\n");
		System.out.println(prueba.substring(3));
		System.out.println(prueba.substring(3, 6));
		System.out.println(prueba.indexOf("l"));
		System.out.println(prueba.lastIndexOf("l"));
		
		char letra = 241;
		System.out.println(letra);
		letra +=32;
		System.out.println(letra);
		
		String pruebasplit = "Deniz Benitez De todos los santos";
		String[] arrayapellidos = pruebasplit.split(" ");
		
		for (int i=0;i<arrayapellidos.length;i++)
			System.out.println(arrayapellidos[i]);
		

	}

}

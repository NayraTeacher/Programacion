package basicos;

public class variables {

	public static void main(String[] args) {
		//enteros, ocupan 4 bytes en memoria
		int entero = 10;
		//decimales
		float dec_corto = 9.39F;
		double dec_grande;
		
		//caracteres, ocupan 2 bytes
		char letra = 'e';
		//bytes
		byte b;
		
		//bit = 0 o 1
		//Byte = 8 bits, ej 00011100
		
		//cadenas de caracteres
		String cadena = "Hola clase";
		
		//Declaración
		//Inicializacion
		//Asignacion de valor
		//Casting
		b = (byte) entero;
		System.out.println(b);
		
		System.out.println(dec_corto);
		System.out.println((int)dec_corto);
		
		String numero = "100";
		System.out.println(Integer.parseInt(numero));
		
		// Operaciones con variables +, -, *, /, %
		System.out.println(numero + numero);//concatenacion de cadenas
		System.out.println(entero + entero + " aqui concateno enteros.");
		//entero = 10
		entero = entero/2;
		//aqui entero vale 5
		//Operaciones resto
		int resto = entero%2; //resto aqui valdria 1
		// Incrementos y decrementos
		int x = 3;
		System.out.println("Equis vale: " + x);
		System.out.println("Equis++ vale: " + x++);
		System.out.println("Equis vale: " + x);
		

	}

}

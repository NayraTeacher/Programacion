package UT620;

public class Actividad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();		
		yo.setNombre("NayrA MARIA");
		System.out.println(yo.getNombre());
		yo.setApellidos("Deniz benitez de TODOS los santos");
		System.out.println(yo.getApellidos());
		yo.setAnio(1978);
		yo.setMes(8);
		yo.setDia(1);
		yo.setSexo('M');
		yo.saludar();
		System.out.println(yo.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "lopez garcia", 8000, 34, -3, 'G');
		invento.saludar();
		
		

	}
	
	

}

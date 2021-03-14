package Ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Boolean 
		//boolean valorLogico (DECLARO VARIABLE)
		//boolean valorLogico = true; (DECLARO E INICIALIZO VARIABLE)
		boolean valorLogico = true;
		System.out.println("El valor de la variable boolean es: " + valorLogico);
		//Caracteres
		//char siempre con comillas simples
		char valorCaracter = 'a';
		valorCaracter = '0';	
		System.out.println("El valor de la variable char es: " + valorCaracter);
		
		//String
		String cadena = "Hola, cómo estás?";
		System.out.println("El valor de la variable string es: " + cadena);
		
		//Tipos de datos enteros
		byte numerUno = 127;
		System.out.println("El valor de la variable byte es: " + numerUno);
		short numerDos = 50;
		System.out.println("El valor de la variable short es: "+ numerDos);
		int numerTres = 300;
		System.out.println("El valor de la variable int es: "+ numerTres);
		
		//Long: si la declaro por defecto en cero, Java la pasa a número entero
		//agrego una L o l para declarar que es LONG.
		long numerCuatro = 0l;
		System.out.println("El valor de la variable long es: "+numerCuatro );
		
		//Tipos de datos reales
		float numerCinco= 0.0f;
		System.out.println("El valor de la variable float es: " + numerCinco);
		double numerSeis = 0.0;
		System.out.println("El valor de la variable double es: "+ numerSeis );
		
		//Constantes
		final int VALOR = 23;
		System.out.println("El valor de la constante final int es: " + VALOR);
		
	}

}

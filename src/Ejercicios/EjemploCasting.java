package Ejercicios;

public class EjemploCasting {

	public static void main(String[] args) {
		int alfa = 20;
		float beta = 23.5F;
		beta = alfa;
		
		//Casting - poner delante de la variable el dato al que quiero convertir
		alfa = (int) beta;
		alfa = (char) 'b';
		System.out.println(alfa	);
		
		//Para pasar de int a cadena de caracteres
		int numero = Integer.parseInt("20");
		System.out.println(numero *3);
		
		//Para pasar de entero a cadena
		String cadena =Integer.toString(30);
		System.out.println(cadena + " es el valor");
		
	}

}

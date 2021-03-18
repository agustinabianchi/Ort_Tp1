package Ejercicios;
import java.util.Scanner;
public class Ejercicio15 {
	
		public static final double ESTATURA_MINIMA = 1.5;
		public static final double EDAD_MINIMA = 7;
	
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad1;
		int edad2;
		int edad3;
		int edad4;
		float estatura1;
		float estatura2;
		float estatura3;
		float estatura4;
					
				
		Boolean entra;
		
		System.out.println("Ingrese la edad");
		edad1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la altura en metros");
		estatura1 = Float.parseFloat(input.nextLine());
		
		entra = true;
		
		if (edad1 >= EDAD_MINIMA && estatura1 > ESTATURA_MINIMA ) {
			System.out.println(entra);
			
		} else {
			entra = false;
			System.out.println(entra);
		}
		
		input.close();
	}

}

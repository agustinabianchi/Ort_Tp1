
package Ejercicios;
import java.util.Scanner;
public class Ejercicio16 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int cantAsientos;
		int cantInscriptos;
		
		System.out.println("Ingrese cantidad de inscriptos");
		cantInscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese cantidad de asientos");
		cantAsientos = Integer.parseInt(input.nextLine());
	
		if (cantAsientos >= cantInscriptos ) {
			System.out.println("Alcanza la cantidad de asientos");
		} else {
			System.out.println("Faltan " + (cantInscriptos - cantAsientos) + " asientos.");
		}

	}

}

package Ejercicios;

import java.util.Scanner;
	public class Ejemplo01 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		String nombre1;
		String nombre2;
		
		System.out.println("Ingrese un nombre");
		nombre1 = input.nextLine();
		
		System.out.println("Ingrese un nombre");
		nombre2 = input.nextLine();
		
		System.out.println("Evaluación de igualdad case sensitive");
		System.out.println(nombre1.equals(nombre2) );
		
		System.out.println("Evaluación de igualdad case insensitive");
		System.out.println(nombre1.equalsIgnoreCase(nombre2));
		
		System.out.println("Evaluo si son distintos");
		System.out.println(!nombre1.equals(nombre2) );
		
		input.close();	
	}

}

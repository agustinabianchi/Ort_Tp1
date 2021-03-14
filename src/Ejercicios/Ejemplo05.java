package Ejercicios;

import java.util.Scanner;

public class Ejemplo05 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad = 0;
		
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		
		if (edad >= 70) {
			System.out.println("Es de tercera edad");
		}
		else if (edad >=18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
			
		input.close();	
		}

	}

}

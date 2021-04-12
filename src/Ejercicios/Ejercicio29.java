package Ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int nota = 0;

		/*
		 * do { System.out.println("Ingrese una nota entre 0 y 10"); nota =
		 * Integer.parseInt(input.nextLine());
		 * 
		 * } while (nota < 0 || nota > 10);
		 * 
		 */

		System.out.println("Ingrese una nota entre 0 y 10");
		nota = Integer.parseInt(input.nextLine());

		while (nota < 0 || nota > 10) {

			System.out.println("Error, la nota debe ser entre 0 y 10");
			nota = Integer.parseInt(input.nextLine());

		}

	}

}

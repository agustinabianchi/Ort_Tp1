package Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
	private static Scanner input = new Scanner(System.in);
	public static final int CANT_EDADES = 5;

	public static void main(String[] args) {
		/*
		 * 27.Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el
		 * promedio de todas las edades ingresadas y cuántas edades fueron valores
		 * impares mayores que 18. [
		 */
		int sumEdades= 0;
		int edad;

		for (int i = 0; i < CANT_EDADES; i++) {
			System.out.println("Ingrese edades");
			edad = Integer.parseInt(input.nextLine());

			sumEdades += edad;
		}

		input.close();

	}

}

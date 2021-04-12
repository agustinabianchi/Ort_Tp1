package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realizá un programa que permita al usuario ingresar dos números enteros num1
		 * y num2, donde el primero siempre deberá ser menor o igual al segundo. La
		 * computadora debe mostrar la secuencia de números existentes entre ambos: a.
		 * Incluyéndolos; b. Excluyéndolos.
		 */

		int num1, num2;

		System.out.println("Ingrese un número entero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro número entero, mayor o igual a " + num1);
		num2 = Integer.parseInt(input.nextLine());

		while (num1 > num2) {

			System.out.println("Error, el número ingresado es incorrecto");
			System.out.println("");
			System.out.println("Ingrese otro número entero, mayor o igual a " + num1);
			num2 = Integer.parseInt(input.nextLine());

		}

		System.out.println("INCLUYENDOLOS ");
		for (int i = num1; i <= num2; i++) {

			System.out.println(i);
		}

		System.out.println("EXCLUYENDOLOS ");
		for (int i = (num1 + 1); i < num2; i++) {

			System.out.println(i);
		}

		input.close();
	}
}

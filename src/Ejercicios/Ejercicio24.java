package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiz� un programa que permita al usuario ingresar dos n�meros enteros num1
		 * y num2, donde el primero siempre deber� ser menor o igual al segundo. La
		 * computadora debe mostrar la secuencia de n�meros existentes entre ambos: a.
		 * Incluy�ndolos; b. Excluy�ndolos.
		 */

		int num1, num2;

		System.out.println("Ingrese un n�mero entero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro n�mero entero, mayor o igual a " + num1);
		num2 = Integer.parseInt(input.nextLine());

		while (num1 > num2) {

			System.out.println("Error, el n�mero ingresado es incorrecto");
			System.out.println("");
			System.out.println("Ingrese otro n�mero entero, mayor o igual a " + num1);
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

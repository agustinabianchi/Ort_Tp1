package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	private static Scanner input = new Scanner(System.in);
	public static final int MIN = 1;
	public static final int MAX = 5;

	public static void main(String[] args) {

		/*
		 * 22.Realiz� un programa que muestre todos los n�meros enteros del 1 al 5, y
		 * luego los mismos n�meros pero en orden inverso. [EC]
		 */

		for (int i = MIN; i < (MAX + 1); i++) {

			System.out.println(i);
		}
		System.out.println("");

		for (int i = MAX; i > (MIN - 1); i--) {
			System.out.println(i);
		}

		input.close();
	}

}

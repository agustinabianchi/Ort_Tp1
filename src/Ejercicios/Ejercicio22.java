package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	private static Scanner input = new Scanner(System.in);
	public static final int MIN = 1;
	public static final int MAX = 5;

	public static void main(String[] args) {

		/*
		 * 22.Realizá un programa que muestre todos los números enteros del 1 al 5, y
		 * luego los mismos números pero en orden inverso. [EC]
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

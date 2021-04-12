package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	private static Scanner input = new Scanner(System.in);
	public static final int CANT_MULT = 10;

	public static void main(String[] args) {

		/*
		 * Realizá un programa que permita ingresar un número entero n. Debe mostrar los
		 * primeros 10 múltiplos de n (desde 1 x n).
		 * 
		 */

		int n;

		System.out.println("Ingrese un número entero");
		n = Integer.parseInt(input.nextLine());
		
		System.out.println("");

		for (int i = 1; i <= CANT_MULT; i++) {
			System.out.println(n * i);
		}

		input.close();
	}

}

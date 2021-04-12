package Ejercicios;

import java.util.Scanner;

public class Ejercicio17vs2 {

	public static final int EDAD_F = 60;
	public static final int EDAD_M = 65;
	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int edad;
		char gen;
		String mensErr = "";
		String jub = "NEGATIVO";

		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());

		if (edad >= EDAD_MIN && edad <= EDAD_MAX) {
			System.out.println("Ingrese su g�nero: F para femenino o M para masculino");
			gen = input.nextLine().toUpperCase().charAt(0);

			switch (gen) {

			case 'M':
				if (edad >= EDAD_M) {
					jub = "AFIRMATIVO";
				}
				break;

			case 'F':
				if (edad >= EDAD_F) {
					jub = "AFIRMATIVO";
				}
				break;

			default:
				mensErr = "G�nero err�neo";
			}
		} else {
			mensErr = "Edad err�nea";
		}
		if (mensErr.equals("")) {
			System.out.println("Est� en edad para jubilarse? " + jub);
		} else {
			System.out.println(mensErr);
		}

	}

}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static final int EDAD_F = 60;
	public static final int EDAD_M = 65;
	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int edad;
		String sexo;

		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());

		if (edad >= EDAD_MIN && edad <= EDAD_MAX) {
			System.out.println("Ingrese su género: M para masculino, F para feminino");
			sexo = input.nextLine().toUpperCase();

			if (sexo.equals("M")) {
				if (edad >= EDAD_M) {
					System.out.println("Podés jubilarte");
				} else {
					System.out.println("No podés jubilarte");
				}
			} else if (sexo.equals("F")) {
				if (edad >= EDAD_F) {
					System.out.println("Podés jubilarte");
				} else {
					System.out.println("No podés jubilarte");
				}
			} else {
				System.out.println("Género erróneo");
			}

		} else {
			System.out.println("Edad errónea");
			;
		}
		input.close();
	}

}
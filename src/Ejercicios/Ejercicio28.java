package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cant;
		int numIngresado;
		int numMayor = 0;
		int posicion = 0;

		System.out.println("Ingrese la cantidad de n�meros que desea cargar");
		cant = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese el n�mero " + i + " de " + cant);
			numIngresado = Integer.parseInt(input.nextLine());

			if (numIngresado > numMayor) {
				numMayor = numIngresado;
				posicion = i;
			}

		}

		System.out.println("El n�mero mayor es el: " + numMayor + ", y apareci� en la posici�n: " + posicion);
	}
}

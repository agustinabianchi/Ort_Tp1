package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cant;
		int numIngresado;
		int numMayor = 0;
		int posicion = 0;

		System.out.println("Ingrese la cantidad de números que desea cargar");
		cant = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese el número " + i + " de " + cant);
			numIngresado = Integer.parseInt(input.nextLine());

			if (numIngresado > numMayor) {
				numMayor = numIngresado;
				posicion = i;
			}

		}

		System.out.println("El número mayor es el: " + numMayor + ", y apareció en la posición: " + posicion);
	}
}

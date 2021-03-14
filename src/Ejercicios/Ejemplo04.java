package Ejercicios;

import java.util.Scanner;

public class Ejemplo04 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numero;
		String salida;
		
		System.out.println("Ingrese un número entre el 1 y el 5");
		numero = Integer.parseInt(input.nextLine());
		
		switch (numero) {
		case 1:
			salida = "Uno";
			break;
			
		case 2:
			salida = "Dos";
			break;
			
		case 3:
			salida = "Tres";
			break;
			
		case 4:
			salida = "Cuatro";
			break;
			
		case 5:
			salida = "Cinco";
			break;
			
		default:
			salida = "Número incorrecto";

		}
		
		System.out.println(salida);
		
		input.close();	
	}

}

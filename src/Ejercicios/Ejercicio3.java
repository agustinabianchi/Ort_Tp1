package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		double numero;
		double multi;
		double divi;
		
		//Ingreso el número
		System.out.println("Ingrese un número");
		numero = Double.parseDouble(input.nextLine());
		
		//Multiplicación
		multi = numero*5;
		
		//División
		divi = numero/2;
		
		//Muestro resultados
		System.out.println("El número multiplicado por 5 es: " +multi + ", y dividido por dos es: "+divi);
		
		input.close();
	}

}

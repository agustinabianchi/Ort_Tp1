package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		double numero;
		double multi;
		double divi;
		
		//Ingreso el n�mero
		System.out.println("Ingrese un n�mero");
		numero = Double.parseDouble(input.nextLine());
		
		//Multiplicaci�n
		multi = numero*5;
		
		//Divisi�n
		divi = numero/2;
		
		//Muestro resultados
		System.out.println("El n�mero multiplicado por 5 es: " +multi + ", y dividido por dos es: "+divi);
		
		input.close();
	}

}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		String nombre;
		
		//Ingreso el nombre
		System.out.println("Hola, por favor ingresa tu nombre");
		nombre = input.nextLine();
		
		//Muestro mensaje de bienvenida
		System.out.println("Hola "+nombre + ", te damos la bienvenida!");
	
		input.close();	
	}

}

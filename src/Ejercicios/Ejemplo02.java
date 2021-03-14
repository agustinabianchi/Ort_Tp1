package Ejercicios;

import java.util.Scanner;
	public class Ejemplo02 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int edad;
		String nombre;
		
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		
		System.out.println("Ingrese su edad");
		edad = input.nextInt();
		//input.nextLine();
	
	
		
		
		System.out.println("Su nombre es "+nombre+" y tiene "+ edad+ " años");
		
		input.close();	
	}

}
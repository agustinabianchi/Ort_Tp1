package Ejercicios;

import java.util.Scanner;
	public class Ejemplo03 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String nombre;
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido "+ nombre);
		
		input.close();	
	}

}
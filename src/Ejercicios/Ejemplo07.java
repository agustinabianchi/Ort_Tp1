package Ejercicios;

import java.util.Scanner;
public class Ejemplo07 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		String alumno1 = "Nicolas";
		String alumno2 = "Nicolas";
		
		System.out.println(alumno1.equals(alumno2));
		
		System.out.println(!alumno1.equals(alumno2));
		
		//Operadores Booleanos
		
		boolean num1= false;
		boolean num2= false; 
		boolean num3= false;
		
		System.out.println(num1==num2&&num2==num3);
		
		
		input.close();	
	}

}

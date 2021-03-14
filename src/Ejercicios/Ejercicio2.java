package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		double nota1;
		double nota2;
		double nota3;
		double promedio;
		
		//Ingreso primera nota
		System.out.println("Ingresá la primera nota");
		nota1 = Double.parseDouble(input.nextLine());
		
		//Ingreso segunda nota
		System.out.println("Ingresá la segunda nota");
		nota2 = Double.parseDouble(input.nextLine());
		
		//Ingreso tercera nota
		System.out.println("Ingresá la tercera nota");
		nota3 = Double.parseDouble(input.nextLine());
		
		//Muestro el promedio
		promedio = (nota1+nota2+nota3)/3;
		System.out.println("Tu promedio es: "+promedio);
		
		input.close();
		
	}

}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		double valorHora;
		double cantidadHoras;
		double salario;
		
		//Ingreso valor de la hora
		System.out.println("Ingrese el valor de una hora de trabajo");
		valorHora = Double.parseDouble(input.nextLine());
		
		//Ingreso cantidad de horas por día
		System.out.println("Ingrese la cantidad de horas que trabaja por día");
		cantidadHoras = Double.parseDouble(input.nextLine());
		
		//Calculo el salario semanal
		salario = (cantidadHoras*valorHora)*5.5;
		
		//Muestro total del salario semanal
		System.out.println("Su salario semanal es de: "+ salario);
				
		input.close();
		
	}

}
